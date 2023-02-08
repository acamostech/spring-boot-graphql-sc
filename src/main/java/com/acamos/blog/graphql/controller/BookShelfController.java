/**
 * 
 */
package com.acamos.blog.graphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.acamos.blog.graphql.domain.Author;
import com.acamos.blog.graphql.domain.Book;

/**
 * @author acamos
 *
 */
@Controller
public class BookShelfController {
	
	@QueryMapping
	public Book bookById(@Argument String id) {
		return Book.getById(id);
	}
	
	@SchemaMapping
	public Author author(Book book) {
		return Author.getById(book.getAuthodId());

	}
	
	

}
