package conditionalStatement;

import java.util.Scanner;

public class OddEven {

    // when we declare the variable inside method signature and we initializze the variable while  we calling  the the method
     public void CheckOddEven(int num){  // method signature (int num = parameter)

           // int num = 9;

         if (num % 2 == 0){
         System.out.println("you entered even num");
         }
        else if (num %2 == 1){
         System.out.println("you entered odd num");
        } // method body


     }





    public static void main(String[] args) {

 OddEven obj = new OddEven();
 //obj.CheckOddEven(9); // calling the method/Function // giving argument

Greaternumber obj2  = new Greaternumber();
obj2.number(2,4,8); // calling the method from another class



    }












    }























































