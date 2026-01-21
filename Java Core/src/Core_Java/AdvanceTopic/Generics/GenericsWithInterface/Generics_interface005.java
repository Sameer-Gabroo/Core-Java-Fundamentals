package Core_Java.AdvanceTopic.Generics.GenericsWithInterface;

//when any class implement the interface we have to use generics sign after the interface name to insure that it use the interface
// and if we are not provide the implementation in the implementation class then we have to also add the generics sign after the class name
// as we did in this class we added the generics sign on both side
public class Generics_interface005<T> implements Generics_Interface004<T> {

    private T FoodName;
    private T DrinkName;

    public T getFoodName() {
        return FoodName;
    }

    public void setFoodName(T foodName) {
        FoodName = foodName;
    }

    public T getDrinkName() {
        return DrinkName;
    }

    public void setDrinkName(T drinkName) {
        DrinkName = drinkName;
    }

    @Override
    public void FoodName(T FoodName) {
        this.FoodName=FoodName;
    }

    @Override
    public void DrinkName(T DrinkName) {
       this.DrinkName=DrinkName;
    }
}
