package Core_Java.OOps.Interface.Single_Inharetance;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void Sleep() {
        System.out.println("cat is sleeping");
    }
}
