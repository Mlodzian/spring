package com.michal.spring.repositories;

import com.michal.spring.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michal Cwiekala on 2018-12-04.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
