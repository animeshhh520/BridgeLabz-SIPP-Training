package Inheritance.Library_Management;

public class BookMain {
    public static void main(String[] args) {
        
    
    Book a1=new Book("The night we met", 2017);
    Book a2= new Author("Shivering shadows", 2011, "Ruskin Bond", "lives in mussoorie");
    
    a1.DisplayInfo();
    a2.DisplayInfo();
    }
}
