package stringFunction;

public class StringFunctionDemo {

public void stringFunction1(){

    String obj = new String("Jannat");
    System.out.println(obj);
    char firstLetter = obj.charAt(0);
    System.out.println(firstLetter);
    int length = obj.length();
    System.out.println(length);
    String lowercase= obj.toLowerCase();
    System.out.println(lowercase);
    String uppercase = obj.toUpperCase();
    System.out.println(uppercase);
    String newSpelling = obj.replace("a", "u");
    System.out.println(newSpelling);
    String fullNmae=  obj.concat("Nishu");
    System.out.println(fullNmae);
    String[] twoNames =fullNmae.split(" ");
    System.out.println(twoNames[0]);
    System.out.println(twoNames[1]);



}

public static void stringFunction2(){
    String firstString = "We are learning Java as a part of Automation mCourse";
    firstString.toLowerCase();//calling the method Java created
    firstString.toUpperCase();
    firstString.length();
    char firstLetter = firstString.charAt(0);
    System.out.println(firstString);
    String oneWord = firstString.substring(3,6);  // subString start with 0 and ends with Index+1
    System.out.println(oneWord);
    boolean javaWord = firstString.contains("Java");
    System.out.println(javaWord);
    String[]words = firstString.split("");
    System.out.println(words.length);


}
public static void stringFunction3(){
    String learning = "We are learning manual testing and Java";
   String lowerCase = learning.toLowerCase();






}

    public static void main(String[] args) {
      //stringFunction2();   // calling the method i created
        stringFunction3();
    }
















}
