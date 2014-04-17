package hu.noherczeg.necora.persistence;

import hu.noherczeg.necora.domain.user.User;
import hu.noherczeg.necora.domain.user.UserRepository;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.RootEntityResultTransformer;

class UserHibernateRepository extends JpaHibernateRepository<User, Long> implements UserRepository {

    public UserHibernateRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User findByEmail(String emailAddress) {
        Query query = getCurrentSession().createQuery("from " + User.class.getSimpleName() + " as u left join fetch u.authorities as a where u.email = :email");
        query.setParameter("email", emailAddress);
        query.setResultTransformer(RootEntityResultTransformer.INSTANCE);
        return (User) query.uniqueResult();
    }

    @Override
    public User findByIdWithAll(Long id) {
        Query query = getCurrentSession().createQuery(
                "from " + User.class.getSimpleName() + " as u " +
                "left join fetch u.authorities as a left join fetch u.works as w left join fetch u.awards as aw " +
                "left join fetch u.participantInEvents as pie left join fetch u.employedByInstitutions as ebi left join fetch u.languageSkills as ls " +
                "left join fetch ls.language as lsl left join fetch ls.degreeOfLanguageSkill as lsd " +
                "left join fetch u.applicantInTenders as ait left join fetch u.authorOfPublications aop left join fetch u.degrees as deg " +
                "left join fetch u.supervisesDegrees as sd left join fetch u.supervisesSSAPapers as sssap left join fetch u.specializations as spec " +
                "left join fetch u.memberOfOrganizations as moo left join fetch u.employedByDepartments as ebd left join fetch u.fieldTrips as ft " +
                "left join fetch u.judgesSSAPapers where u.id = :id");
        query.setParameter("id", id);
        query.setResultTransformer(RootEntityResultTransformer.INSTANCE);
        return (User) query.uniqueResult();
    }

}
