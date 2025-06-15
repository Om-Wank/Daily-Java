/* Take no of rows from the user  rows=4
     

   1 2 3 4
   4 5 6
   6 7
   7

   */
  import java.io.*;
class Program11{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the row");

        int row=Integer.parseInt(br.readLine());

        int num=1;
         
        for(int i=0;i<row;i++){
           int num2=num;
            for(int j=0;j<row-i;j++){

                System.out.print(num2+" ");
                num2++;
            }
            num=num2-1;
            System.out.println();
        }

    }
}

