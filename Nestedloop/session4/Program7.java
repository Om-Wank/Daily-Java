/* Take no of rows from the user  ROWS=5
   

   1 2 3 4 5
   2 3 4 5
   3 4 5
   4 5
   5

   */
import java.io.*;

class Program7{

    public static void main(String[] agrs)throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the row:");
        int row=Integer.parseInt(br.readLine());

        int num=1;

        for(int i=0;i<row;i++){
            int num2=num;
            for(int j=0;j<row-i;j++){
                System.out.print(num2+" ");
                num2++;
            }
            num++;
            System.out.println();
        }
    }
   }