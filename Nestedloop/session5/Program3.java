/* Take no of rows from the user ROWS=4
           d
	       c c
       b b b
     a a a a

     */

     import java.io.*;
     class Program3{

        public static void main(String[] args)throws IOException{

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          System.out.println("Enter the row");
          int row=Integer.parseInt(br.readLine());
 char ch=97;
          for(int i=0;i<row;i++){
           
            for(int j=0;j<row-i-1;j++){
              System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
              System.out.print((char)(ch+row-1));
            }
            ch--;
            System.out.println();
          }

        }
     }