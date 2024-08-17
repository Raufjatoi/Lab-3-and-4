// 1. Animal Kingdom:
// Create classes for different animals (e.g., Dog, Cat, Bird) inheriting from an Animal class.
// Implement specific sounds for each animal.
// Create an array of Animal objects and demonstrate polymorphism by calling the makeSound()
//method on each object.
class Animal {
    void makeSound(){
        System.out.println("");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("woh woh ");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("meow meowww ");
    }
}
class Bird extends Animal {
    void makeSound() {
        System.out.println("teow ");
    }
}
public class ex1{
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        for (Animal animal : animals ){
            animal.makeSound();
        }
    }
}