package Core_Java.AdvanceTopic.Generics.GenericsWithClass;


//how to create the generic class

// first we will add <> arrow braket next to the class name with any letter for type we use T its standard
public class Learn_Generics002<T> {

    //while inializing the variable we don't need to add the variable type
 private T name;
 private T RollNum;

    public Learn_Generics002(T name, T rollNum) {
        this.name = name;
        RollNum = rollNum;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getRollNum() {
        return RollNum;
    }

    public void setRollNum(T rollNum) {
        RollNum = rollNum;
    }
}
