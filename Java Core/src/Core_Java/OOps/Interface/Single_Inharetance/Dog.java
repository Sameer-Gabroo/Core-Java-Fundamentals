package Core_Java.OOps.Interface.Single_Inharetance;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog Eat Meat");
    }

    @Override
    public void Sleep() {
        System.out.println("Dog is sleeping");
    }
}
