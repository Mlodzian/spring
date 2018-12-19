package com.michal.spring.bootstrap;

import com.michal.spring.model.Author;
import com.michal.spring.model.Book;
import com.michal.spring.repositories.AuthorRepository;
import com.michal.spring.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Michal Cwiekala on 2018-12-04.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	AuthorRepository authorRepository;
	BookRepository bookRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}
	
	private void initData(){
		Author janek = new Author("Jan", "Walzon");
		Book ddd = new Book("DDD", "1234", "Helion");
		janek.getBooks().add(ddd);
		ddd.getAuthors();
	
	
	}
}
