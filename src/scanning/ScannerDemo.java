package scanning;

import java.util.Scanner;

public class ScannerDemo {

    // get input from console age (int) , regNo(short) , stockBalance (float)

public void  scanDemo(){
    String myName = "Jannat" ;
    int age = 32 ;
    short regNo =  31421;
    float stockBalance = 4.45123f ;

    Scanner scan = new Scanner(System.in) ;



}


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        String myName = scan.nextLine() ;
        System.out.println( "My name is " + myName);


        int age = scan.nextInt();
        System.out.println( "My age is " + age) ;


        short regNo =  scan.nextShort() ;
        System.out.println( "My regNo is " + regNo);


        float stockBalance =scan.nextFloat() ;
        System.out.println( "My stock balance is " + stockBalance);












    }












































}
