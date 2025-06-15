/*  Take no of rows from the user  ROWS=4
     

    a b c d
    a b c
    a b
    a

    */
 import java.io.*;

    class Program6{

        public static void main(String[] args)throws IOException{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row");
            int row=Integer.parseInt(br.readLine());

            
            for(int i=0;i<row;i++){
                char ch=97;

                for(int j=0;j<row-i;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();

            }
        }
    }