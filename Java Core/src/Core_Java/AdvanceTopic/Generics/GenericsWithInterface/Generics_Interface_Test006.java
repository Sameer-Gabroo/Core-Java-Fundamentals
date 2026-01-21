package Core_Java.AdvanceTopic.Generics.GenericsWithInterface;

public class Generics_Interface_Test006 {

    //Now we are provideing the implementation so we don't need to add the generic sign we will simply add the values and provide the implementation
    // this is simple

    static void main(String[] args) {
        Generics_interface005 test = new Generics_interface005();
        test.FoodName("Meat");
        test.DrinkName("Marenda");
        System.out.println(test.getFoodName());
        System.out.println(test.getDrinkName());



    }
}
