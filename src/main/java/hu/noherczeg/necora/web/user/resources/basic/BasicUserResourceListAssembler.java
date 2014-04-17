package hu.noherczeg.necora.web.user.resources.basic;

import hu.noherczeg.necora.domain.user.User;
import hu.noherczeg.necora.web.home.HomeController;
import hu.noherczeg.necora.web.user.UserController;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class BasicUserResourceListAssembler extends ResourceAssemblerSupport<List<User>, BasicUserResourceList> {

    public BasicUserResourceListAssembler() {
        super(UserController.class, BasicUserResourceList.class);
    }

    @Override
    public BasicUserResourceList toResource(List<User> users) {
        BasicUserResourceList resourceList = new BasicUserResourceList();
        for (User user: users) {
            UserBasicResource resource = new UserBasicResource(
                    user.getId(), user.getEmail(), user.getTitle(), user.getLastName(), user.getFirstName(), user.getEhaCode());
            resource.add(linkTo(methodOn(UserController.class).getOne(user.getId())).withSelfRel());
            resourceList.getUsers().add(resource);
        }
        resourceList.add(linkTo(methodOn(UserController.class).listUsers()).withSelfRel());
        resourceList.add(linkTo(methodOn(HomeController.class).entryPoints()).withRel("parent"));
        return resourceList;
    }
}
