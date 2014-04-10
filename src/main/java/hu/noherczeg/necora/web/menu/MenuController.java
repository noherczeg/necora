/**
 *
 */
package hu.noherczeg.necora.web.menu;

import hu.noherczeg.necora.domain.menu.Menu;
import hu.noherczeg.necora.domain.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Collection;

@Controller
@RequestMapping("menus")
class MenuController {

    private MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<Menu> getMenus() {
        return menuService.listMenu();
    }

    @RequestMapping(value = "new", method = RequestMethod.GET)
    @ResponseBody
    public Menu create(Principal principal, @RequestParam(value = "name", required = true) final String name) {
        return menuService.create(name, principal);
    }
}
