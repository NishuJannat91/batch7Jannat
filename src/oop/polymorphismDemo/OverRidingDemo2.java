package oop.polymorphismDemo;

public class OverRidingDemo2 extends OverRidingDemo1{
 // parent class == Super Class
 //child Class === Sub Class
/*
*desing by Dharti
* @param members
 */
@Override
    public void courseMember(int members){
        //int members =5;
        System.out.println(members);
String group = "Selenium";
        System.out.println(group);
    }


    public static void main(String[] args) {
        OverRidingDemo2 obj = new OverRidingDemo2();
        obj.courseMember(5);
    }



}
