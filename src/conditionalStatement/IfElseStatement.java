package conditionalStatement;

import java.util.Scanner;

public class IfElseStatement {



    int age = 20 ;

    public void ifElse() {

        if (age == 10) {
            System.out.println("age is 10");
        } else if (age == 15) {
            System.out.println("age is 15");
        } else if (age == 20) {
            System.out.println("age is 20");
        } else {
            System.out.println("none of the above is true");
        }


    }

    public void practice (){
/*
 1.Ask user to enter any number and through your code you print the num.
2. Ask user to enter any num--- and if number is 20 ,print the num is 20.

3. A school has following rules for grading system:
        a. Below 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
        Ask user to enter mark in the console and print the corresponding grade.
        **homework
        *update code for grade
        **take two numbers from user and print the greater number.
        ***take a number from user and find that number is positive or negative.
        //any number 0 ,1,2,3 to up is positive
        //any -1,-2,3 is negative
        ****take a temparature as farenheit ....
        if it 30 -49 print cold
        if it is 50-69 print warm
        if it is 70- 89 --- it is super hot visit Bangladesh/India
 */
 int num =20 ;


    }



public void grade (){
    Scanner scan = new Scanner(System.in) ;
  int mark = scan.nextInt();
    if (mark < 25) {
        System.out.println (" the student got F");
    }
    else if ((mark ==25) ||(mark <45)) {
        System.out.println("The student got E");
    }
    else if ((mark==45) || (mark < 50)) {
        System.out.println("The student got D");
    }
    else if ((mark == 50) || (mark < 60)){
        System.out.println("The student got C");
    }
    else if ((mark==60) || (mark <80)){
        System.out.println("The student got B");
    }
   else if ((mark ==80) ||(mark >80)){
        System.out.println("The student got A");

    }
//    a. Below 25 - F
//    b. 25 to below 45 - E
//    c. 45 to below 50 - D
//    d. 50 to below 60 - C
//    e. 60 to below 80 - B
//    f. Above 80 - A




}

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in) ;
//        int mark = scan.nextInt();
//        System.out.println( "My mark is " + mark);
//
////     int mark1 = scan.nextInt();
////        System.out.println( "my mark1 is " + mark1);
//      int num = scan.nextInt() ;
//        if (num == 10) {
//            System.out.println("num is 10");
//        }
//
//        else if (num == 15) {
//            System.out.println( "num is 15");
//        }
//
//        else if (num == 20) {
//            System.out.println("num is 20");
//        }
//
//        else {
//            System.out.println("none of the above is true");
//        }
        IfElseStatement obj =new IfElseStatement();
        obj.grade ();
//      Scanner scan = new Scanner(System.in) ;
//       int mark = scan.nextInt() ;


























    }
























}
