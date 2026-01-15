package Core_Java.OOps.Interface.Single_Inharetance;

public interface Animal {

    public static final int  numOfAnimals=150;    //Static variables are allowed in interface means we can access these variable through class instance
                        int  numOfCages=154;     //By default, the variables in interface are public final and static so we don't need to write it

    public abstract void eat();

    void Sleep();


//    static methods
    public static void animalFood(){                  //we can also create the static method in which we can provide body and acces through class but the instance of interface can not acces this method
        System.out.println("animal eat everything");
    }

//    Defual method
    public default void animalWalk(){              //we can create the default method this method is not accesseble through class but can be acces through instance
        System.out.println("animal is walking "); //the reason we create the default methid is if we don;t the instance to provide implementation which may cause the erorr to everyclass which implement this interface so we will provide the body
    }


}
