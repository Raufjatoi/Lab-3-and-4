// 1. Animal Kingdom:
// Create classes for different animals (e.g., Dog, Cat, Bird) inheriting from an Animal class.
// Implement specific sounds for each animal.
// Create an array of Animal objects and demonstrate polymorphism by calling the makeSound()
// method on each object.
class Animal {
    void sound(){
        System.out.println("");
    }
}
class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("wooh wooh");
    }
}
class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Meow meow");
    }
}
class Bird extends Animal {
    @Override
    void sound(){
        System.out.println("Cheow cheow");
    }
}
public class lab1 {
    public static void main(String[] args) {
            Animal[] animals = new Animal[3];
            animals[0] = new Dog();
            animals[1] = new Cat();
            animals[2] = new Bird();

            for (Animal a : animals){
                a.sound();
            }
    }

    
}
