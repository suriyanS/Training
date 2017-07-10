
package com.mycompany.app;

public class BookBuilder {
	public int id;
public String name, author, publiser;
public int quantity;



	public BookBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public BookBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}

	public BookBuilder setPubliser(String publiser) {
		this.publiser = publiser;
		return this;
	}

	public BookBuilder setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public Book build() {
       return new Book(id, name, author, publiser, quantity);
		
	}

}


 


