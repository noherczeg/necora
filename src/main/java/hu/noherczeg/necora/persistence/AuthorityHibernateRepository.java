package hu.noherczeg.necora.persistence;

import hu.noherczeg.necora.security.authority.Authority;
import hu.noherczeg.necora.security.authority.AuthorityRepository;
import org.hibernate.SessionFactory;

class AuthorityHibernateRepository extends JpaHibernateRepository<Authority, Long> implements AuthorityRepository {
    public AuthorityHibernateRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
