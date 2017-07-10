package com.mycompany.app;
public class BookShop {

	public static void main(String[] args) {
		
		Book book = new BookBuilder().setId(109).setName("C++").setAuthor("Dev").setPubliser("KIL").setQuantity(1).build();
		//Book book = new BookBuilder().
		System.out.println(book);
		//System.out.println(p1);
	}

}