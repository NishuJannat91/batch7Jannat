package accesModifier;

public class Access1 {

    /*
    public
    private
    ----
    protected
     */

    public int hours =24; // is accessible through the project
    private int minutes =60; //is accessible only its own class
    String day ="Tuesday";//package private //no access//default modifier is accessible within the package
    protected int year =168; //it can be use in other package but need inheritance

public void printHours(){
    System.out.println("This is public method");
}

private void printMinutes(){
    System.out.println("This is private method");

}

void printDay(){
    System.out.println("This is package private access modifiers");
}

protected void printYear(){
    System.out.println("This is protected method");
}
    public static void main(String[] args) {
        Access1 obj =new Access1();
        System.out.println(obj.hours);
        System.out.println(obj.minutes);
        System.out.println(obj.day);
        System.out.println(obj.year);




    }


















}
