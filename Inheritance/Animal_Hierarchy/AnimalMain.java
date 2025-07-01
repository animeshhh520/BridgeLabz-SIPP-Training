package Inheritance.Animal_Hierarchy;
public class AnimalMain {
    public static void main(String[] args) {
        Animal a1=new Dog("pedigree",10);
        Animal a2= new Cat("Ms. Whiskers",1);
        Animal a3 = new Bird("sid",1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
    
}
