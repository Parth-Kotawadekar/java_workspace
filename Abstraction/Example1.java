abstract class Animal{
    public String animal_name;

    public Animal(String an_name){
        this.animal_name = an_name;
    }

    public abstract void makeSound();

    public String getName(){
        return animal_name;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(getName() + "Barks...");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName() + "Meows...");
    } 
}

public class Example1{
    public static void mail(String args[]){
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Aires");

        myDog.makeSound();
        myCat.makeSound();
    }
}