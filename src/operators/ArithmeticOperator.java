package operators;

public class ArithmeticOperator {
 //+ , - , * , /

public void arithmetic () {
    int a = 15;
    int b = 30;
    int e = a + b;
    int d = e;
    int f = b - a;
    int g = a * b;
    int h = b / a;
    System.out.println("15+30 = " + e); // + called concatenation
    System.out.println(d);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
    // = means assignment operator
}
public static void newArithmetic(int a ,int b) { //parameter
    System.out.println(a+b);
    System.out.println(b-a);
    System.out.println(a*b);
    System.out.println(b/a);



}

    public static void main(String[] args) {
     ArithmeticOperator obj = new ArithmeticOperator() ; //instantiated the class / created an object of the class
     obj.arithmetic();
     newArithmetic(15,30); // argument
     System.out.println("-----------------");
     newArithmetic(10 ,20);
     System.out.println("--------------");
     newArithmetic(30,60);





    }

























}
