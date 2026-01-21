package Core_Java.AdvanceTopic;

public class lambdaExpression001{

// java 8 ---> minamal code , functional programing
// java 8 ---> lamda expression , streams , Date&Time API
// lambda expression is an anonymous function (no name , no return type , no access modifier )
// we can only use lambda expression with funtional interface means (the interface which have only 1 method )

//let say we have the functional interface Animal and we want to use that in normal java so we wil  have to create a class to implement this
// So in lambda we can simply use the instance of interface and remove the name return type and acces modifier
//See how simple is this
    math addition = (a,b)->System.out.println(a+b);
    math subtraction = (a,b)->System.out.println(a-b);
    math divition = (a,b)->System.out.println(a/b);

//this is how we will call the instance of interface
    static void main(String[] args) {
        lambdaExpression001 obj= new lambdaExpression001();
        obj.addition.calculation(4,5);
        obj.subtraction.calculation(4,5);
        obj.divition.calculation(4,5);
    }

}
//This is how we create a class to implement the interface then call the main method to too much code

//    class dog implements math{
//        @Override
//        public void calculation() {
//        System.out.println("calculating  ");
//        }
//
//         static void main(String[] args) {
//         calculation  Cal = new calculation(2,5);
//         Cal.calculation();
//      }
//}

// this is funtional interface beacasue it has only 1 method

interface math{
    void calculation(int a,int b);
}