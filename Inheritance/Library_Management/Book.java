package Inheritance.Library_Management;

public class Book {
    String title;
    int publishingYear;
    public Book(String title, int publishingYear){
        this.title=title;
        this.publishingYear=publishingYear;
    }
    public void DisplayInfo(){
        System.out.println("Title of Book: "+title);
        System.out.println("Publishing Year: "+publishingYear);
    }
    
}
