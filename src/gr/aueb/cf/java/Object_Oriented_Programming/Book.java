package gr.aueb.cf.cf9.exercises.Object_Oriented_Programming;

public class Book {
    private static int totalBooks = 0;
    private String title;
    private String author;
    private int pages;

    public Book(){
        totalBooks++;
    }

    public Book(String title, String author, int pages){
        this();
        this.title = title;
        this.author = author;
        this.pages = pages;

    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPages(){
        return this.pages;
    }

    public void setPages(int pages){
        if(pages < 0){
            System.out.println("Please enter a positive number of pages.");
        } else{
            this.pages = pages;
        }
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
}
