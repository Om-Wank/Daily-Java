/*Tack no of rows from the user ROWS =3
 A b C 
 d E f
 G h I
 */
import java.io.*;

 class Program7{

      public static void main(String[] args) throws IOException{
         
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter the row :");
         int row=Integer.parseInt(br.readLine());

         char ch1=65;
         char ch2=97;
         int num=1;

         for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
               if(num%2==0){
                System.out.print(ch2+" ");
               }else{
                System.out.print(ch1+" ");
               }
               num++;
               ch1++;
               ch2++;

            }
            System.out.println();
            ch1--;
         }
      }
   }