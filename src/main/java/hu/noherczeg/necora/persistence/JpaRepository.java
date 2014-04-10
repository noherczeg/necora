package hu.noherczeg.necora.persistence;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface JpaRepository<T, ID extends Serializable> {
    public T findById(final ID id);

    public List<T> findByCriteria(final Criterion criteria);

    public List<T> findAll();

    public void save(T entity);

    public T update(T entity);

    public void delete(final T entity);

    public void deleteById(final ID id);
}
