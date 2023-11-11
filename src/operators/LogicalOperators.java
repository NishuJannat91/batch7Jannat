package operators;

import java.util.Scanner;

public class LogicalOperators {

    //add/or and(&&) or (||) --these are also returning true/false

    int a =20 ;
    int b =9 ;
    int c =12 ;


    public void logical(){
/*
    int a =20 ;
    int b =9 ;
    int c =12 ;
 */
   Scanner scan = new Scanner(System.in) ;
   int a = scan.nextInt();
   int b = scan.nextInt();
   int c = scan.nextInt();





// when there is && either one is false === total is false
     boolean result1 = (a>b) && (b>c) ;
        System.out.println(result1);

     boolean result2 = (a<b) && (b==c) ;
        System.out.println(result2);
//when there is || either one is true === total is true
     boolean result3 = (a<b) || (b<c) ;
        System.out.println(result3);
     boolean result4 =(a>b) || (b<c) ;
    }

    public static void main(String[] args) {
    LogicalOperators obj = new LogicalOperators() ;
    //obj.logical();
    Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter your name below :");
    String myName = scan.nextLine() ;
        System.out.println("My name is " + myName) ;

     // get input from console age (int) , regNo(short) , stockBalance (float)
     // ifElse statement -- conditional statement

      String veg = "Tomato";
      if (veg == "Tomato") {
          System.out.println("bring it home");
      }

      else {
              System.out.println("bring something else");
          }


      }








    }










