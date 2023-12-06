package variableType;

public class Variable_Types {


    /*There are three types of variables:
    i. Instance/Global Variables -- The variables declares inside the class are called Instance variable
    ii. Local variables -- The variables declare inside the methods, are called local variables. Local variables
    born inside the method and die inside the method.
    iii. Static variables -- static variables belongs to the class. This is called class variable. Static
    variables we create when we see the variable/variables are common to all objects

     */



    byte age = 100; // age is a instance variable. we declare and initialize/define the variable
    short CheckingAccount ; // only declared the variable. this one also called instance variable



    public void study(){ // function--- Method can hold variables, statement
        System.out.println(age);
        CheckingAccount = 32767;   // initialize/define the variable
        System.out.println(CheckingAccount);
        boolean snooringIntheClass;
        snooringIntheClass = true;

    }
   public void sleepInTheClass(){

   }


    public static void main(String[] args) {

        String name = "Jannat";
    }













}
