/* Take no of rows from the user     ROWS=3
     3
     6 9
     12 15 18
 
     ROWS=4
       
     4
     8 12 
     16 20 24
     28 32 36 40
      
     */


     import java.io.*;

     class Program9{

          public static void main(String[] args)throws IOException{

               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.println("Enter the row:");
               int row=Integer.parseInt(br.readLine());

               int num=row;
               int num2=1;
               for(int i=0;i<row;i++){
                    for(int j=0;j<=i;j++){
                         System.out.print(num*num2+" ");
                         num2++;
                    }
                    System.out.println();
               }
          }
     }