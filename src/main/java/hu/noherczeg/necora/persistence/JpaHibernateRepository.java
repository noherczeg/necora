package hu.noherczeg.necora.persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

class JpaHibernateRepository<T, ID extends Serializable> implements JpaRepository<T, ID> {

    private Class<T> entity;

    protected SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public JpaHibernateRepository(SessionFactory sessionFactory) {
        this.entity = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Class<T> getEntity() {
        return entity;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(ID id) {
        return (T) getCurrentSession().get(getEntity(), id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll() {
        return (List<T>) getCurrentSession().createQuery("from " + getEntity().getSimpleName() + " order by key('id') DESC").list();
    }

    @Override
    public void save(T entity) {
        getCurrentSession().persist(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T update(T entity) {
        return (T) getCurrentSession().merge(entity);
    }

    @Override
    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    @Override
    public void deleteById(ID id) {
        T entity = findById(id);
        delete(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findByCriteria(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(entity);
        criteria.add(criterion);
        return (List<T>) criteria.list();
    }
}
