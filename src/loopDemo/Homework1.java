package loopDemo;

public class Homework1 {
//Consider an array of the following numbers:
//25, 26, 28, 29,30, 35
//Print the sum of even numbers only for the array element


public void Even() {
    int[] number = {25, 26, 28, 29, 30, 35}; //index value is 5 and length value is 6
    int sum =0;
    for (int i= 0; i<number.length; i++) {
       // System.out.println(number[i]);


        if (number[i] % 2 == 0) {
            System.out.println(number[i] + "even");
            sum=sum+number[i];
            }
    }
    System.out.println(sum);
}



    //Write a program to find the sum of 20-30 .
public void Sum(){
    int sum =0 ;
for (int a=20 ;a<=30;a++){
    sum= sum+a;
    }
    System.out.println(sum);
}







    //Take 5 numbers like 100,200,300,400,500 as an array and find the average of those number.
public void ArrayNum(){
    int number []={100,200,400,500};
    int sum =0;
    for (int a=100 ;a<=500; a++){
        sum=sum+a;}
        System.out.println(sum);

float average=sum/number.length;
    System.out.println(average);
}

    public static void main(String[] args) {
    Homework1 obj = new Homework1();
    obj.Even();
 //   obj.Sum();
  //  obj.ArrayNum();
    }


































































































}
