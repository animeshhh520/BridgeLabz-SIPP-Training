package Inheritance.Library_Management;

public class Author extends Book{
    String name;
    String bio;
    public Author(String title,int publishingYear,String name,String bio){
        super(title, publishingYear);
        this.name=name;
        this.bio=bio;
    }
    public void DisplayInfo(){
        super.DisplayInfo();;
        System.out.println("Name of Author: "+name);
        System.out.println("Biography of Author: "+bio);
        }
    
}
