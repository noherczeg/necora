package hu.noherczeg.necora.persistence;

import hu.noherczeg.necora.domain.user.User;
import hu.noherczeg.necora.domain.user.UserRepository;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.RootEntityResultTransformer;

class UserHibernateRepository extends JpaHibernateRepository<User, Long> implements UserRepository {

    public UserHibernateRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User findByEmail(String emailAddress) {
        Query query = getCurrentSession().createQuery("from " + User.class.getSimpleName() + " as u join fetch u.authorities as a where u.email = :email");
        query.setParameter("email", emailAddress);
        query.setResultTransformer(RootEntityResultTransformer.INSTANCE);
        return (User) query.uniqueResult();
    }

}
