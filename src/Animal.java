package src;

abstract class Animal {
    private String name;
    public Animal(String name){ // constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    abstract void makeSound(); // abstract method
    public void eat(){
        System.out.println(name + " is eating.");
    }


}
