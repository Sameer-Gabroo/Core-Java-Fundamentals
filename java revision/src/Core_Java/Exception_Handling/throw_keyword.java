package Core_Java.Exception_Handling;

import java.util.Scanner;

public class throw_keyword  {

//throw keyword is used create the custom exception and also we have to catch that exception or use the throws keyword

    static void main(String[] args)   {


        Scanner nm= new Scanner(System.in);
        System.out.println("Enter the number ");

        try {
            int a = nm.nextInt();
            if (a>100){
                throw new ArithmeticException("testing it");  //this is how we throw the exception
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
}

//knowloage

//if we use Exception it will be checked Exception means if will check the code runtime and force you to use try catch or through
//if we use any sepecific exception like arthimatic it means it will be checked on run time

