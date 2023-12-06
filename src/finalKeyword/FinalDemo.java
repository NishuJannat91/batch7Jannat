package finalKeyword;

public class FinalDemo {
    /*Final keyword can be used before the class, methods and variable
      Final class cannot be extended. THis class cannot have any child
      Final variable cannot be modified. the value is final
      final method cannot be overridden

      Override ----is a part of oop concept
      Dharti and Shifat ----they both of them work in same project
      Dharti
     */

   final String name="Jannat";

/*
*created by Shifat
* when date
 */

    public void printName(){
        System.out.println("Printing name Shifat" ) ;



    }


    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();
       // obj.name="Nurun Jannat";
        System.out.println(obj.name);
    }






}
