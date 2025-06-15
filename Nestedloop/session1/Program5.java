/* Tac=ke no of rows from the user 
 rows=3

 a b c
 d e f
 g h i

 */

 import java.io.*;

 class Program5{

    public static void main(String [] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());
        char ch1=97;

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(ch1+" ");
                ch1++;
            }
            System.out.println();
        }
    }
 }