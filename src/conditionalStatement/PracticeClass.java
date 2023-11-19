package conditionalStatement;

import java.util.Scanner;

public class PracticeClass {
//     *take two numbers from user and print the greater number.
//     **take a number from user and find that number is positive or negative.
//         any number 0 ,1,2,3 to up is positive
//         any -1,-2,3 is negative
//     ****take a temperature as farenheit ....
//        if it 30-49 print cold
//        if it is 50-69 print warm
//        if it is 70- 89 --- it is super hot visit Bangladesh/India
//   int a = 20 ;
//   int b = 10 ;}


    public void greater() {
        Scanner scan = new Scanner(System.in); //pre-defined class
//       boolean greater = scan.nextBoolean() ;
//       boolean a ;
//       boolean b ;
//       if (greater == a>b  );
//        System.out.println( "is greater number " );


        int a = scan.nextInt();
        System.out.println("The first number is " + a);
        int b = scan.nextInt();
        System.out.println(" The second number is " + b);

        if (a > b) {
            System.out.println(a + "is the greater number");
        } else if (a == b) {
            System.out.println(a + "is equal " + b);
        } else {
            System.out.println(a + " is the smaller number");
        }


    }


    public void number() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println(a + "is the Positive ");
        } else if (a > 0) {
            System.out.println(a + "is a positive number");
        } else if (a < 0) {
            System.out.println(a + "is a negative number");
        }


    }


    public void weather (){
        Scanner scan = new Scanner(System.in) ;
        int temperature = scan.nextInt();

        if ((temperature == 30) || (temperature < 49)) {
            System.out.println("Temperature is cold");
        } else if ((temperature == 49) || (temperature < 69)) {
            System.out.println("Temperature is warm");
        } else if ((temperature == 69) || (temperature < 89)) {
            System.out.println("Temperture is Super hot like Bangladesh");
        }

















    }
public static void main(String[] args) {

//    PracticeClass obj = new PracticeClass();
//    obj.greater();}



       PracticeClass obj = new PracticeClass() ;
       obj.number();



//PracticeClass obj = new PracticeClass() ;
//obj. weather();




















}



}

