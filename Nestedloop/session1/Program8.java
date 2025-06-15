/* Take no of rows from the user
   rows=3;

   9 8 7
   6 5 4
   3 2 1

   */

   import java.io.*;

   class Program8{

        public static void main(String[] args)throws IOException{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter the rows");
            int row=Integer.parseInt(br.readLine());

            int num=row*row;

            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){

                    System.out.print(num+" ");
                    num--;
                }
                System.out.println();
            }


        }

   }