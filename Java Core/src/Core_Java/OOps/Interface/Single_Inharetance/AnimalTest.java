package Core_Java.OOps.Interface.Single_Inharetance;

public class AnimalTest {


    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

       dog.eat();
       dog.Sleep();
       cat.eat();
       cat.Sleep();

        System.out.println(Animal.numOfAnimals);  // this is how we call the variable through Animal interface
        System.out.println(Animal.numOfCages);
        Animal.animalFood(); // this is we call the static method through Animal interface
        dog.animalWalk();  // this is hoe we call the default method through instance from Animal interface
    }




}
