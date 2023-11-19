package conditionalStatement;

import java.util.Scanner;

public class Store {
    /*A shop gives discount of 10% if the cost is more than 1000.
    Ask user for quantity Suppose,
     one unit will cost 20$
    judge and print total cost for user.*/

public void total(){
    System.out.println( "enter the quantity");
    Scanner scan = new Scanner(System.in) ;
    int quantity =scan.nextInt() ;
    int totalcost= quantity*20 ;



    if (quantity>1000){
        int discount =((totalcost/100)*10) ;
        System.out.println(discount);
    }
else if (quantity<1000) {
        System.out.println( " no discount");
    }







}


    public static void main(String[] args) {


    Store obj = new Store();
    obj.total();






    }
















































































}
