/* Take non of rows from the user ROWS=4
  

    4 3 2 1
    3 2 1
    2 1
    1

    */
 import java.io.*;
    class Program5{

        public static void main(String[] args)throws IOException{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row");
            int row=Integer.parseInt(br.readLine());

            int num=row;
            for(int i=0;i<row;i++){
                int num2=num;
                for(int j=0;j<row-i;j++){
                    System.out.print(num2+" ");
                    num2--;
                }
                System.out.println();
                num--;
            }

        }
    }