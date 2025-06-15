/* Take no of rows from the user ROWS=3
    * * * *
      * * *
        * *
          *
*/

import java.io.*;
class program1{

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());

        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<row-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}