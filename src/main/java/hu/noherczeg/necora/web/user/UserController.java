package hu.noherczeg.necora.web.user;

import hu.noherczeg.necora.domain.menu.Menu;
import hu.noherczeg.necora.domain.menu.MenuService;
import hu.noherczeg.necora.domain.user.User;
import hu.noherczeg.necora.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	private MenuService menuService;
    private BasicUserResourceAssembler userResourceAssembler;

    @Autowired
    public UserController(UserService userService, MenuService menuService) {
        this.userResourceAssembler = new BasicUserResourceAssembler();
        this.userService = userService;
        this.menuService = menuService;
    }

    @RequestMapping(value = "/listMenus", method = RequestMethod.GET)
    @ResponseBody
	public Collection<Menu> getMenusForUser() {
		return menuService.listMenu();
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
	public List<User> listUsers() {
		return userService.listUsers();
	}

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public BasicUserResource getOne(@PathVariable(value = "id") final long id) {
        return userResourceAssembler.toResource(userService.findById(id));
    }
}
