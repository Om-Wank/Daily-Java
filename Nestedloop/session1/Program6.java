/* Take no of rows from the user 
 rows=3

 1 1 1
 2 2 2
 3 3 3

 */

 import java.io.*;

 class Program6{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int rows=Integer.parseInt(br.readLine());

        int num=1;

        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }

    }
 }