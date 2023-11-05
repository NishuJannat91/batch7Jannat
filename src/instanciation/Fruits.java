package instanciation;

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


    String name;
    String color;
   static  String size = "small";
    char vitamin;


   public static void place(){ // static method
       String location = "USA" ; //local  variable //declare on initialize
       System.out.println( location ); // use the variable
       //state = "East" ;
   }



    public static void main(String[] args) {

        Fruits banana = new Fruits();
        banana.name = "Banana";
        banana.color = "Yellow";
       // banana.size = "small";
        banana.vitamin ='A';


        System.out.println(banana.name);
        System.out.println(banana.color);
        System.out.println(banana.vitamin);
        System.out.println(size);

       place(); // called the method
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
