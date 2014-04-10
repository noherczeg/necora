package hu.noherczeg.necora.persistence;

import hu.noherczeg.necora.domain.menu.Menu;
import hu.noherczeg.necora.domain.menu.MenuRepository;
import org.hibernate.SessionFactory;
import org.hibernate.transform.RootEntityResultTransformer;

class MenuHibernateRepository extends JpaHibernateRepository<Menu, Long> implements MenuRepository {

    public MenuHibernateRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Menu findByNome(String nome) {
        org.hibernate.Query query = getCurrentSession().createQuery("from " + getEntity().getSimpleName() + " as m where m.name = :name");
        query.setParameter("name", nome);
        query.setResultTransformer(RootEntityResultTransformer.INSTANCE);
        return (Menu) query.uniqueResult();
    }
}
