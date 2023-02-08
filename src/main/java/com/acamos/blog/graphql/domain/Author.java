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
public class Author {
	
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	public Author(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	private static List<Author> authors = Arrays.asList(
			new Author("auth-1", "Harry", "Potter"),
			new Author("auth-2", "Steve", "Jobs"),
			new Author("auth-3", "Elon", "Musk")
	);
	
	public static Author getById(String id) {
		return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	
	
	

}
