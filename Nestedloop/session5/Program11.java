/* WAP to printf thr addition of factorials of two given number from user 
   Input: num1=4         //24
          num2=5         //120
   output:
Addition of factorials of 4 and 5 is 144 
  24+120=144 write proper code

  */

  import java.io.*;
  class Program11{

   public static void main(String[] args) throws IOException{
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the num1 value");

      int num1= Integer.parseInt(br.readLine());

      System.out.println("Enter the num2 value");
      int num2 = Integer.parseInt(br.readLine());

      int add1=1;
      int add2=1;;

      for(int i=1;i<=num1;i++){
            add1=add1*i;
      }
       for(int i=1;i<=num2;i++){
            add2=add2*i;
      }

     

      System.out.println("Addition of factorials of "+ num1+" and "+num2+" is "+(add1+add2));
   }
  }