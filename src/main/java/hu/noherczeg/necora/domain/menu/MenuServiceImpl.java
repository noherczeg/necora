package hu.noherczeg.necora.domain.menu;

import hu.noherczeg.necora.security.authentication.AclHelpService;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.acls.domain.BasePermission;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import java.security.Principal;
import java.util.Collection;

class MenuServiceImpl implements MenuService {
	
	private MenuRepository menuRepository;
	private UserDetailsService userDetailsService;
	private AclHelpService aclHelpService;

    public MenuServiceImpl(MenuRepository menuRepository, UserDetailsService userDetailsService, AclHelpService aclHelpService) {
        this.menuRepository = menuRepository;
        this.userDetailsService = userDetailsService;
        this.aclHelpService = aclHelpService;
    }

    @PostFilter("hasPermission(filterObject, 'read') or hasAuthority('ROLE_ADMIN')")
    @Transactional(readOnly = true)
	public Collection<Menu> listMenu() {
		return menuRepository.findAll();
	}
	
	public Collection<Menu> listMenuNoSecurity() {
		return menuRepository.findAll();
	}
	
	public Menu findByMenuNome(String name) {
		return menuRepository.findByNome(name);
	}
	
	public Menu create(String name, Principal auth) {
		Menu newMenu = new Menu();
		newMenu.setNome(name);
		newMenu.setPath("/");
		
		menuRepository.save(newMenu);
		aclHelpService.addSinglePermission(Menu.class, newMenu.getId(), userDetailsService.loadUserByUsername(auth.getName()), BasePermission.READ);
		return newMenu;
	}
}
