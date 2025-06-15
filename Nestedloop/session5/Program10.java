/*10.Take no rows from the user ROWS=4
  
     1
     4 9
     64 125 216
     2401 4096 6561 10000
     */

     import java.io.*;
     class Program10{

          public static void main(String[] args) throws IOException{
               
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               
               System.out.println("Enter the row:");
               int row=Integer.parseInt(br.readLine());

               int num=1;

               for(int i=1;i<=row;i++){

                   
                    for(int j=0;j<i;j++){
                         System.out.print((int)Math.pow(num, i)+" ");
                         
                          num++;
                    }
                   

                    System.out.println();

               }
          }
     }