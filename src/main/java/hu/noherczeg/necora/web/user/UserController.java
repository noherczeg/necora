package hu.noherczeg.necora.web.user;

import hu.noherczeg.necora.domain.user.UserService;
import hu.noherczeg.necora.web.user.resources.full.UserFullResource;
import hu.noherczeg.necora.web.user.resources.basic.BasicUserResourceList;
import hu.noherczeg.necora.web.user.resources.basic.BasicUserResourceListAssembler;
import hu.noherczeg.necora.web.user.resources.full.FullUserResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private FullUserResourceAssembler userResourceAssembler;
    private BasicUserResourceListAssembler userResourceListAssembler;

    @Autowired
    public UserController(UserService userService) {
        this.userResourceAssembler = new FullUserResourceAssembler();
        this.userResourceListAssembler = new BasicUserResourceListAssembler();
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public BasicUserResourceList listUsers() {
        return userResourceListAssembler.toResource(userService.listUsers());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserFullResource getOne(@PathVariable(value = "id") final long id) {
        return userResourceAssembler.toResource(userService.findById(id));
    }
}
