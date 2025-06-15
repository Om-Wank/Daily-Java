/* Take no of rows from the user     ROWS=4
    c
    b b
    a a a

      */

      import java.io.*;

      class Program7{

        public static void main(String[] args)throws IOException{

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          System.out.println("Enter the row");
          int row=Integer.parseInt(br.readLine());

          char ch=(char)(97+row-1);
          for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
              System.out.print(ch+" ");
            }
            ch--;
            System.out.println();
          }
        }
      }