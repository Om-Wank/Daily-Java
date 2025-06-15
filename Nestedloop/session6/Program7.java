/* Enter the ROWS:4
4 3 2 1 
  3 2 1 
    2 1 
      1 
      
      */

      import java.io.*;
      class Program7{

        public static void main(String[] args) throws IOException{
            
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row:");
            int row=Integer.parseInt(br.readLine());

            int num=row;

            for(int i=0;i<row;i++){
                int num1=num;
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }

                for(int j=0;j<row-i;j++){
                    System.out.print(num1+" ");
                    num1--;
                }
                num--;
                System.out.println();
            }
        }

      }