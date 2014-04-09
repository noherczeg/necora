package hu.noherczeg.necora.web.user;

import hu.noherczeg.necora.domain.user.User;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

class BasicUserResourceAssembler extends ResourceAssemblerSupport<User, BasicUserResource> {

    public BasicUserResourceAssembler() {
        super(UserController.class, BasicUserResource.class);
    }

    @Override
    public BasicUserResource toResource(User user) {
        BasicUserResource resource = createResourceWithId(user.getId(), user);
        resource.add(linkTo(methodOn(UserController.class).listUsers()).withRel("users"));
        return resource;
    }

}
