package instanciation;

public class Cats {
    /* Class - Cats - size, color , tail ,eyes --- properties
    Objects - myCat , yourCat
    */
     String size ;
     String color ;
     String tail ;
     String eyes ;

    public static void main(String[] args) {

        Cats myCat = new Cats();
        myCat.size = "Big";
        myCat.color = "White";
        myCat.tail = "Small";
        myCat.eyes ="Blue";

        System.out.println( "myCat is " + myCat.size);
        System.out.println( "myCat color is " + myCat.color);
        System.out.println( "myCat tail is " + myCat.tail);
        System.out.println( "myCat eyes is " + myCat.eyes);
        System.out.println( "---------------------" );
        Cats yourCat = new Cats();
        yourCat .size = "Small";
        yourCat.color = "Black";
        yourCat.tail = "Big";
        yourCat.eyes ="Brown";

        System.out.println( "yourCat size is " + yourCat.size);
        System.out.println( "yourCat color is " + yourCat.color);
        System.out.println( "yourCat tail is " + yourCat.tail);
        System.out.println( "yourCat eyes is " + yourCat.eyes);

















    }

}

