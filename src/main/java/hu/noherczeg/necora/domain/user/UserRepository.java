package hu.noherczeg.necora.domain.user;

import hu.noherczeg.necora.persistence.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String emailAddress);
}
