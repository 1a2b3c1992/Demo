package com.oop.demo;

public class Publisher {
	public static void main(String[] args) {
		Book goodRhymes = new Book();
		goodRhymes.author = "Marie Madison";
		goodRhymes.title = "Nursery Rhymes";
		goodRhymes.isEbook = true;
		goodRhymes.chapters = new String[]{"Jack and Jill", "Happy Lucky Guy"};
		goodRhymes.numPages = 16;
		goodRhymes.index = "Rhymes Index";
		goodRhymes.openEbook();
		goodRhymes.getChapters();
		
		
		Book brittanica = new Book();
		brittanica.author = "Brittanica";
		brittanica.title = "Brittanica Record Book 2024";
		brittanica.isEbook = true;
		brittanica.chapters = new String[]{"Computers 101", "World of Electricity"};
		brittanica.numPages = 200;
		brittanica.index = "Brittanica Contents";
		brittanica.openEbook();
		brittanica.getChapters();
	}
}
