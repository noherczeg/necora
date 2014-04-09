package hu.noherczeg.necora.domain.menu;

import hu.noherczeg.necora.persistence.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
	
	public Menu findByNome(String nome);

}
