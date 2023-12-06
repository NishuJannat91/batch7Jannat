package finalKeyword;

public class FinalDemo2 extends FinalDemo{


 @Override   //annoatation
    public void printName(){
     System.out.println("Printing name");
     String anotherName= "Fayza";
     String anotherName2 = "Sadia";
     System.out.println(anotherName +" + "+anotherName2);
     System.out.println("Dharti");
  }


    public static void main(String[] args) {
        FinalDemo2 obj=new FinalDemo2();
        obj.printName();
    }












}
