package mapsPrograms;

public class Book {
	private int id;
	private String name;
	private String author;
	public static int idGenerator=100;
	public Book() {
		super();
	}
	public Book(String name, String author) {
		super();
		this.id=++idGenerator;
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Book [getName()=" + getName() + ", getAuthor()=" + getAuthor() + ", getId()=" + getId() + "]";
	}
	
	
	

}
