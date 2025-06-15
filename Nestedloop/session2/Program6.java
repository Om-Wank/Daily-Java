/*Take no of rows from the user ROWS=4
   D D D D
   C C C C
   B B B B
   A A A A
   */

   import java.io.*;

   class Program6{

      public static void main(String[] args) throws IOException{
         
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter the row :");
         int row=Integer.parseInt(br.readLine());

         char ch1=65;

         for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
               System.out.print((char)(ch1+row-1)+" ");
            }
            System.out.println();
            ch1--;
         }
      }
   }