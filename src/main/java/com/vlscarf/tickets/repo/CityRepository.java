package com.vlscarf.tickets.repo;

import com.vlscarf.tickets.models.Cities;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<Cities, Long> {
}
