package loopDemo;

public class LoopHomework {
   /* Write a function that and create a loop between 1-10. And determine which
    number is positive and which number is negative.*/
    /*
    Write a java function and create an array in 4, 5, 6, 7, 8, 9, 10
    and use a loop and determine that which number is divided by 2 or not.
     If divided by 2 that is even else the number is odd. */
    /*
    Write a function and create a loop inside it from 20-50 and find which number is divisible by 7.
     */
    public void loopPositiveNegative(){


       for (int a=1 ; a<=10; a++) {
           System.out.println(a);
//
//         for (int b=0 ; b<=-10 ; b--){
//         System.out.println(b);
//}
//        int a=0;
//        int b=0;
//do {
//    System.out.println(a);
//    a++;
//   System.out.println(b);
//   b--;
//} while ((a<=10))
           if (a==0);{
           System.out.println(a +"positive");}
           if (a>0){
               System.out.println(a+ "positive");
           }
           else if (a<0){
               System.out.println(a+ "negative");
           }
       }
    }
public void oddEven(){

      int[] number={4,5,6,7,8,9,10}  ;

    for (int i =4 ;i<=6;i++){
        System.out.println(number[i]);
        if (number[i]%2==0){
            System.out.println(number[1]+ "even");}
        else if (number[i]%2==1){
            System.out.println(number[1]+ "odd");}


        }
    }


public void divisible(){
for (int a=20;a<=50;a++){
    System.out.println(a);
    if (a%7==0){
        System.out.println(a +"divided");
    }
    else if (a%7==1){
        System.out.println(a+ "not divided");
    }



}



}

    public static void main(String[] args) {
        LoopHomework obj =new LoopHomework();
     //   obj.loopPositiveNegative();

        obj.oddEven();
//        obj.divisible();





    }

































































































}
