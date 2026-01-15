package Core_Java.Exception_Handling;

public class Try_Catch_Exception {


//    In try ctach block we handle the exception which can break the code to execute so we handle the exception like this




    static void main(String[] args) {

//       Here is the example of the array which contain the length of 5
        int []Arr = {3,2,65,76,43};

//      but what if we try to acces the index 6 of array 5 this wil through the excetion "Index 6 out of bounds for length 5" and out executing the code further fot that reason we use exception handling

        try {                                   // this is how we put our code in try block in which we feel it can through exception
            int a = Arr[6];
        } catch (IndexOutOfBoundsException e) {  // and this is how we catch the exception. execption depend on your code here we know we will got the index outof bound exception so we have added the IndexOutOfBound Exception
            System.out.println("Array size is 5 and you are searching for index 6");   // we can also add the csutome messages
            System.out.println(e.getMessage());  // we can also print the message we have multiple methods in exception which we can acess through e. and aslo Excetion is the main class
        }

//        We can also catch multiple exception is signal catch like

        try {
            int divide = 5/0;        // As we know any thing divided by zero will through exception so we will handle it and lets say we are not sure which exception to handle then we will add multiple exception
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){    // like this we can add mutiple exceptions
            System.out.println(e.getMessage());
        }

    }
}
