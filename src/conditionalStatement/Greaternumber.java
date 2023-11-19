package conditionalStatement;

public class Greaternumber {




    public void number (int x, int y ,int z){

        if ((x>y) && (x>y)) {
            System.out.println(x + " is greater num");
        }
        else if ((y>x) &&(y > z)){
            System.out.println(y + " is greater num");
        }
        else if ((z>x) && (z >y)) {
            System.out.println(z + " is greater num");

        }


    }

    public static void main(String[] args) {
        Greaternumber obj = new Greaternumber();
        obj.number(4,6,2);





    }













}
