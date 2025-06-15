/* Take the no rows from the user  rows=4
 
     
   4 3 2 1
   4 3 2
   4 3
   4

   */

   import java.io.*;
   class Program12{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the row");
        int row=Integer.parseInt(br.readLine());

        for(int i=0;i<row;i++){
            int num=row;
            for(int j=0;j<row-i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }

    }
   }
