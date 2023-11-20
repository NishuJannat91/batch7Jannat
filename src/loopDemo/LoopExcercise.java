package loopDemo;

public class LoopExcercise {
// with the help of gitbash ...I push the codes to git(local) and github(central Repo)
/*
what is Loop //repeating a blocks of code

 */
public void loopIntroduction (){
    //print 1-10
//    System.out.println(1);
//    System.out.println(2);
//    System.out.println(3);
//    System.out.println(4);
//    System.out.println(5);
//    System.out.println(6);
//    System.out.println(7);
//    System.out.println(8);
//    System.out.println(9);
//    System.out.println(10);



}
// 1.While loop 2.for loop 3.Do-while loop 4.foreach loop
public void whileLoop(){
    int a = 1 ;// initialize
    while (a<=10){ //condition
        System.out.println(a);
       a++; //increment //increment by 1
    }

//print 10-50 using While loop
    int b = 10;
    while (b<=50){
        System.out.println(b);
        b++;
    }
    System.out.println("-----------------------");
    int c = 50;
    while (c>=10){
        System.out.println(c);
        c--; // decrement
    }

int d = 1 ;// initialize
    while (d<=50){//condition
        System.out.println(c);
        c=c+2; //increase by 2
    }



}
public static void  forLoop (){
   for (int a=1;a<=10;a++) {
       System.out.println(a);
   }
//   for (int a=10;a>=1;a--){
//       System.out.println(a);
//   }
//   for (int a =10;a>=1;a=a-2){ //decrease by 2
//       System.out.println(a);
//   }
//

}
//Do-while Loop
public void doWhileLoop(){
    //print 5-10
    int d =5;
    do {
        System.out.println(d);
        d++;
    }
 while (d<=10);
}
    public static void main(String[] args) {
        LoopExcercise obj = new LoopExcercise();
        //obj.loopIntroduction();
        //obj.whileLoop();
        //forLoop();
        obj.doWhileLoop();
    }
































































}
