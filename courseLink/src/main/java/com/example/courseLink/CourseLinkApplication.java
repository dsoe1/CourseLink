package com.example.courseLink;

import com.example.courseLink.entity.Author;
import com.example.courseLink.entity.Book;
import com.example.courseLink.entity.Category;
import com.example.courseLink.entity.Publisher;
import com.example.courseLink.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseLinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseLinkApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return(args) -> {

			Book book1 = new Book("9781259872976", "Software Engineering: A Practioner’s Approach, 9th edition",
														"The world's leading textbook in software engineering.");
			Author author1 = new Author("Pressman & Maxim",
														"internationally recognized authorities on software process improvement and software engineering technologies");
			Category category1 = new Category("Computer Science");
			Publisher publisher1 = new Publisher("McGraw Hill");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("032197137X", "Organic Chemistry (MasteringChemistry) 9th Edition",
													"Gives students a contemporary overview of organic principles and the tools for organizing and " +
															"understanding reaction mechanisms and synthetic organic chemistry.");
			Author author2 = new Author("Leroy Wade & Jan Simek", "Master educators in the field of chemistry with credentials from" +
																	"Harvard and Stanford University");
			Category category2 = new Category("Chemistry");
			Publisher publisher2 = new Publisher("Pearson");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("1538101238", "Music Theory and Composition: A Practical Approach",
														"Accessible approach to music theory through an emphasis on melody and counterpoint.");
			Author author3 = new Author("Stephen C. Stone", "Music theory faculty at The Johns Hopkins University Peabody Institute for 14 years. " +
																		"He has served as chair of the theory department at Peabody and been the director of the Peabody program at the Homewood campus.");
			Category category3 = new Category("Music Arts");
			Publisher publisher3 = new Publisher("Rowman & Littlefield");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);

		};
	}

}
