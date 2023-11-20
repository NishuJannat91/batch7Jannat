package arrayPractice;

public class ArrayDemo {
    //array can hold multiple elements
    //Array length is fixed in size
    //we cannot add or remove element later
    String [] studentName = {"Jannat" , "Dharti" , "Razia" , "Urmi"} ; //Array data
    // index value (Jannat)
    //length of this array =4
    //What is the last index here -----3
   //studentName is array variable
 String location = "Texas" ;


    public void arr(){
//        System.out.println(studentName.length);
//        System.out.println(studentName[0]);
//        System.out.println(studentName[1]);
//        System.out.println(studentName[2]);
//        System.out.println(studentName[3]);
       // System.out.println(studentName[4]); //indexoutifboundException
      //  print 10,15,30,60
      //  int[]myNum= {10, 15 ,30,60} ;
for (String m :studentName){  //for each loop
    System.out.println(m);
}
for (int i =0 ;i<studentName.length;i++){
    System.out.println(studentName[i]);
}
    }


    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo() ;
        obj.arr();










    }


































}
