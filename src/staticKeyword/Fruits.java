package staticKeyword;

public class Fruits {
    //instance variable
    /*
    Class - fruits -name, color , size ,vitamins --- properties
    Objects - Banana , Apple , Mango, Avocado , Grape , Orange,

    Class - vegetables - name, color , size ,vitamins , nutritions , price -- properties
    Objects - Tomato , Cucumber, Potato , Carrots , Cabbage,,,

    Class - Cats - size, color , tail ,eyes --- properties
    Objects - myCat , yourCat , Sharna'sCat , Diksha'sCat

    Class - UptightStudents - id , name ,group , batch --- properties
    Objects - Sharna , Majed ,Keya . Jannat, Sadia


     */
  /*
  variable has three parts
  i.declare the variable
  ii. initialize the variable
  iii. use the variable
   */




    String name; // instance variables / properties // declaring the variable
    String color; // declaring the variable
   static  String size = "small"; // static methods and variables belongs to class not objects // declaring the variable
    char vitamin; // declaring the variable
    String state ; // non static variable


   // When we see the value of variable/variables are common to all objects // declaring the variable
    public static void hello (){ // static method
        String location = "USA" ;// local variable // declare and initialize
        System.out.println(location); // use the variable
        // state = "East" ;
        size = "big" ;

    }

    public void price(int amount){
        System.out.println(amount);







    }





   public static void place(){ // static method
       String location = "USA" ; //local  variable //declare on initialize
       System.out.println( location ); // use the variable
       //state = "East" ;
   }

    // instance/object

    public static void main(String[] args) {

        Fruits banana = new Fruits(); //created an object of the class. that means i instantiated the class.
        banana.name = "Banana"; //banana is a reference variable or obj
        banana.color = "Yellow";
       // banana.size = "small";
        banana.vitamin ='A'; //initializing /defining the variable


        System.out.println(banana.name); //using the variable
        System.out.println(banana.color);
        System.out.println(banana.vitamin);
        System.out.println(size);

       place(); // called the method
        banana.price( 10) ;
        System.out.println( " ------ " );


        Fruits mango = new Fruits();
        mango.name = "mango";
        mango.color = "Green";
       // mango.size = "small";
        mango.vitamin ='C';

        System.out.println(mango.name);
        System.out.println(mango.color);
        System.out.println(mango.vitamin);
        System.out.println(size);

      place();// called the method
        mango.price(20);
        System.out.println( " ------ " );


        Fruits apple = new Fruits();
        apple.name = "Apple";
        apple.color = "Red";
      //  apple.size = "small";
        apple.vitamin ='B';

        System.out.println(apple.name);
        System.out.println(apple.color);
        System.out.println(apple.vitamin);
        System.out.println(size);

        place(); // called the method




    }



























}
