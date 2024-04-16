package com.oop.demo;

public class Book {
	int numPages;
	String index;
	String[] chapters;
	String author;
	String title;
	boolean isEbook;
	
	public void getChapters() {
		for(int i=0; i<chapters.length; i++) {
			System.out.println(chapters[i]);
		}
		if(numPages > 100) {
			System.out.println("Pages Exceeded 100 Limit");
		}
	}
	
	public void openEbook() {
		if(isEbook) {
			System.out.println("Opening E Book "+title);
		}
	}
}
