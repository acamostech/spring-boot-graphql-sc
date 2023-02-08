/**
 * 
 */
package com.acamos.blog.graphql.domain;

import java.util.Arrays;
import java.util.List;

/**
 * @author acamos
 *
 */
public class Book {
	
	private String id;
	private String name;
	private int pageCount;
	
	private String authodId;
	
	public Book(String id, String name, int pageCount, String authodId) {
		super();
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.authodId = authodId;
	}
	
	private static List<Book> books = Arrays.asList(
			new Book("book-1", "Spring boot dummies" , 125, "auth-1"),
			new Book("book-2", "Java dummies" , 150, "auth-2"),
			new Book("book-3", "MicroService Architecture" , 175, "auth-3")
			);
	
	public static Book getById(String id) {
		return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getAuthodId() {
		return authodId;
	}

	public void setAuthodId(String authodId) {
		this.authodId = authodId;
	}
	
	

}
