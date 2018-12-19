package com.michal.spring.repositories;

import com.michal.spring.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michal Cwiekala on 2018-12-04.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
