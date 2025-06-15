/* Take no of rows & cols from the user
   Rows=3;
   col=4;
     
    
   1 2 3 4 
   5 6 7 8 
   9 10 11 12

   */

   import java.io.*;

   class Program4{

        public static void main(String[] args)throws IOException{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the number of rows");
            int row=Integer.parseInt(br.readLine());

            System.out.println("Enter the number of col");
            int col=Integer.parseInt(br.readLine());

            int num=1; 

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(num+" ");
                    num++;
                }
                System.out.println();
            }

        }
   }
