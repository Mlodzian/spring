package com.michal.spring.bootstrap;

import com.michal.spring.model.Author;
import com.michal.spring.model.Book;
import com.michal.spring.model.Publisher;
import com.michal.spring.repositories.AuthorRepository;
import com.michal.spring.repositories.BookRepository;
import com.michal.spring.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Michal Cwiekala on 2018-12-04.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}
	
	private void initData(){
		Author janek = new Author("Jan", "Walzon");
		Publisher helion = new Publisher("Helion", "Katowice");
		publisherRepository.save(helion);
		
		Book ddd = new Book("Biedny los Galernikow", "1234", helion);
		janek.getBooks().add(ddd);
		ddd.getAuthors().add(janek);
		
		authorRepository.save(janek);
		bookRepository.save(ddd);
		
		Author edmunt = new Author("Edmunt", "Stark");
		Publisher nowaEra = new Publisher("Nowa Era", "Gliwice");
		publisherRepository.save(nowaEra);
		Book dupek = new Book("Dzieje Nocnej Strazy", "2234", nowaEra);
		edmunt.getBooks().add(dupek);
		dupek.getAuthors().add(edmunt);
		
		authorRepository.save(edmunt);
		bookRepository.save(dupek);
	}
}
