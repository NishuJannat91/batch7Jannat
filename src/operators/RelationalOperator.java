package operators;

public class RelationalOperator {

    //< , > , > = ,< = , == , != , these will not going to return a value , these will give only true or false

    static int a = 20 ; // instance/object variable
    static int b = 9 ; //instance variable


   public static void relational(){

   boolean result1 =a>b ;
       System.out.println(result1);
   boolean result2 =a<b ;
       System.out.println(result2);
   boolean result3 = a>=b ; // greater than or equal
       System.out.println(result3);
   boolean result4 = a<=b ;
       System.out.println(result4);
   boolean result5 = a==b ;  // == means equal
       System.out.println(result5);
   boolean result6 = a!=b ; //!= means not equal
       System.out.println(result6);





   }


    public static void main(String[] args) {
    //RelationalOperator obj = new RelationalOperator() ;
    //obj.relational();
    relational();
  //open the gitbash
  //come to the folder cd...javaBatch7
  //javaBatch7 (master)
  //git add *
  //git commit -m "added two new files arithmetic anf relation operators"
  //git push




    }


























}
