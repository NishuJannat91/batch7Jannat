package parameterization;

public class ParameterDemo {

    //parameterization is part of the method signature.
     public void play(String game){
         System.out.println(game);



     }

    public static void main(String[] args) {
        ParameterDemo Arafat = new ParameterDemo(); // object of the class
        Arafat.play("Football"); //when we give value it call argument

        ParameterDemo Farjana = new ParameterDemo(); // objects of the class
        Farjana.play("ludu");

        ParameterDemo Shefali= new ParameterDemo(); // objects of the class
        Shefali.play("kutkut");
    }



}
