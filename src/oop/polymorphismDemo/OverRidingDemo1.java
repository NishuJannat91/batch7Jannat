package oop.polymorphismDemo;

public class OverRidingDemo1 {
    /*
    OverRiding is called run time polymorphism
     */
    /*
    * design by Shifat
    *@param members
     */


    public void courseMember(int members){
        //int members =5;
        System.out.println(members);

    }


    public static void main(String[] args) {
        OverRidingDemo1 obj = new OverRidingDemo1();
        obj.courseMember(5);

    }

}
