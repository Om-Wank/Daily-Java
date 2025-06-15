/* Take no of rows from the user     ROWS=4
   1
   1 2
   1 2 3 
   1 2 3 4
   */

   import java.io.*;

   class Program4{

      public static void main(String[] args)throws IOException{
       
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter the rows");
         int row=Integer.parseInt(br.readLine());

        for(int i=0;i<row;i++){
         int num=1;
         for(int j=0;j<=i;j++){
            System.out.print(num+" ");
            num++;
         }
         System.out.println();
        }
         
      }
   }