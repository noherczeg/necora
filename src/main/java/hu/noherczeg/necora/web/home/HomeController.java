package hu.noherczeg.necora.web.home;

import hu.noherczeg.necora.security.authority.RoleConstants;
import hu.noherczeg.necora.security.util.SecurityUtils;
import hu.noherczeg.necora.web.user.UserController;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public EntryPointsDTO entryPoints() {
        EntryPointsDTO epd = new EntryPointsDTO();
        if (SecurityUtils.userHasAuthority(RoleConstants.ROLE_ADMIN))
            epd.add(linkTo(methodOn(UserController.class).listUsers()).withRel("users"));
        if (SecurityUtils.userHasAuthority("ROLE_FAKER"))
            epd.add(linkTo(methodOn(UserController.class).listUsers()).withRel("fakery"));
        return epd;
    }
}
