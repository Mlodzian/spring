package com.michal.spring.repositories;

import com.michal.spring.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michal Cwiekala on 2018-12-04.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
