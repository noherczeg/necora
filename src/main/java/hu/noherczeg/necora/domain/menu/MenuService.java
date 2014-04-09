package hu.noherczeg.necora.domain.menu;

import java.security.Principal;
import java.util.Collection;

public interface MenuService {
    public Collection<Menu> listMenu();
    public Collection<Menu> listMenuNoSecurity();
    public Menu findByMenuNome(String name);
    public Menu create(String name, Principal auth);

}
