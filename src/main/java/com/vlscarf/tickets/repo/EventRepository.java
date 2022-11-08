package com.vlscarf.tickets.repo;

import com.vlscarf.tickets.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
