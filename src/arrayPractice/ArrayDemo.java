package arrayPractice;

public class ArrayDemo {
    //array can hold multiple elements
    //Array length is fixed in size
    //we cannot add or remove element later
    String [] studentName = {"Jannat" , "Dharti" , "Razia" , "Urmi"} ; //Array data
    // index value (Jannat)
    //length of this array =4
   //studentName is array variable
 String location = "Texas" ;


    public void arr(){
        System.out.println(studentName.length);
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
       // System.out.println(studentName[4]); //indexouyifboundException
      //  System.out.println(location);






    }


    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo() ;
        obj.arr();










    }


































}
