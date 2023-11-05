package dataTypePackage;

public class DataType { // Carle Braces

 // Program is  a set of instructions for the computer to follow //
 // Class

 // Class can hold what? i. Variables ii. Methods (Functions)
 //String group ="evening" ;
 //int batch = 7 ;
 // ( ) --- parenthesis ;
 //{ } --- carle braces ;
 //[ ] --- square bracket ;
 /*there are two type of methods
  main method -- very special -- coming from Java -- all commands come from here
  custom method -- creating by us -- for particular group of code
  */
 public static void main(String[] args) { //main method use for commands.
  /* there are many types of data.

  byte -- it can store whole numbers upto 127;
  short -- it can store whole numbers upto 32767;
  int -- it can store whole numbers upto 2147483647;
  long -- it can store whole numbers upto 9223372036854775807L;
  float -- stores fractional numbers. Sufficient for staring 6 to 7 decimal digits;
  double -- Stores fractional numbers. Sufficient for storing 15 decimal digits;
  boolean -- Stores true or false values;
  char -- Stores a single character/letter or ASCII values

*/

  String name = "Jannat"; // variable... name, value = Jannat, data type = String
  byte age = 100; // variable = age, valuer = 100, data type = int ( integer-- number)

  System.out.println(name);
  System.out.println(age);
  short CheckingAccount = 32767;
  int savings = 2147483647 ;
  long regNum = 9223372036854775807L ;
  float height = 5.533434f ;
  double stock = 5435.2058403258345454 ;
  boolean snoringInTheClass = true ;
  char MiddleInitial = 'N' ;//
  // ctrl+c = copy
  //ctrl+v = paste
  //ctrl+A = select whole in the page
  //ctrl+Z = undo
  //ctrl+s = save
  // double quotation = " --- String
  // single quotation = ' ---char
  System.out.println("The checking account balance is " + CheckingAccount);// concatenation
  System.out.println(savings);
  System.out.println(regNum);
  System.out.println(height);
  System.out.println(stock);
  System.out.println(snoringInTheClass);
  System.out.println(MiddleInitial);

 }










}















