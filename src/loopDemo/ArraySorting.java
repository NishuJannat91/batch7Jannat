package loopDemo;

import java.util.Arrays;

public class ArraySorting {
 /*   Write a program to Sort Numeric Array In Ascending Order
    Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}*/



public void numeric(){

int[] number ={23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
    Arrays.sort(number);
    for (int i=0;i< number.length; i++) {
        System.out.println(number[i]);
    }


}

    public static void main(String[] args) {
ArraySorting obj = new ArraySorting();
obj.numeric();

}












}
