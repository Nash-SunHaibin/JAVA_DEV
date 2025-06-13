package src;

public class Dog extends Animal{
    public Dog(String name){
        super(name); // call the constructor of the parent class Animal
    }

    @Override
    void makeSound(){
        System.out.println("Woof Woof!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Dog's name: " + dog.getName());
        dog.makeSound();
        dog.eat();
    }
}
