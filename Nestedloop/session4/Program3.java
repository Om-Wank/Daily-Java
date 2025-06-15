/* Take no rows from the user  ROWS=4
    
    * * * *
    * * *
    * *
    *
    
 */

 import java.io.*;
 class Program3{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the row:");
        int row=Integer.parseInt(br.readLine());

        for(int i=0;i<row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }