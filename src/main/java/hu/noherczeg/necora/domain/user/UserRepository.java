package hu.noherczeg.necora.domain.user;

import hu.noherczeg.necora.persistence.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(final String emailAddress);
    User findByIdWithAll(final Long id);
}
