package hu.noherczeg.necora.domain.event;

import hu.noherczeg.necora.persistence.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
