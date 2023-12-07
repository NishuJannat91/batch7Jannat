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
    System.out.println(lowerCase);

}

public static void reverseString(){
    String name = "Jannat";
    char firstLetter = name.charAt(5);
    for (int i =name.length()-1;i>=0 ;i--){
        System.out.print(name.charAt(i));
    }



}

public static void reverseString2 (){
    String name = "Jannat";
    String reverse ="";
    for (int i =name.length()-1; i>=0;i--){
        reverse = reverse + name.charAt(i); //String+Char =String
    }
    System.out.println(reverse);
}

public static void palindrome(){
    String name ="madam";
    String reverse ="";
    for (int i = name.length()-1;i>=0; i--){
      reverse = reverse+name.charAt(i); // string = char = string
    }
    System.out.println(reverse);
    if (reverse.equals(name)){
        System.out.println("This is palindrome");
    }
    else {
        System.out.println("This is not palindrome");
    }

}
public static void stringToInt(){
    //int a=200;
   // System.out.println(a+100);
    String dollar = "200";
    System.out.println(dollar+100);
   int newDollar= Integer.valueOf(dollar);
    System.out.println(newDollar+100);
}

public static void intToString(){
int a=200;
    System.out.println(a+300);
    String newAValue = String.valueOf(a);
    System.out.println(newAValue + 300);
}
public static void stringBuffer(){
    StringBuffer sb=new StringBuffer("Hello ");
    sb.append(" Batch7");
    System.out.println(sb);
sb.insert(6," Participant ");
    System.out.println(sb);
 sb.reverse();
    System.out.println(sb);

}




    public static void main(String[] args) {
      //stringFunction2();   // calling the method i created
       // stringFunction3();
       // reverseString();
        //reverseString2();
       // palindrome();
        //stringToInt();
        //intToString();
        stringBuffer();
    }
















}
