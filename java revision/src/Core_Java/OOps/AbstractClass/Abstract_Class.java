package Core_Java.OOps.AbstractClass;

public abstract class Abstract_Class {

        public void parent(){
            System.out.println("tesing paraent 1");
        }

        abstract public  void parent2();




}
class child1 extends Abstract_Class {

    @Override
    public void parent2() {            // this is how we have to implement the abstract method if the class implement
    }
}

//    Rule number 1 one abract method male the whole class abstract
//    Absract class is just a class which contain abstract method init
//   abstract method is a method which dose not contain body init and the class which extend this class will provide the body of abstract methos if not then that should also be abstract.
//   we cann not create the object of abstract class
