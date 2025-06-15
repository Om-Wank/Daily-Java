/*  Take no of rows from the user     ROWS=4
    1
    2 2
    3 3 3
    4 4 4 4
    */

    import java.io.*;

    class Program3{

        public static void main(String [] args)throws IOException{

            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

            System.out.println(("Enter the row"));
            int row=Integer.parseInt(br.readLine());

            int num=1;
            for(int i=0;i<row;i++){
                for(int j=0;j<=i;j++){


                    System.out.print(num+" ");
                }
                System.out.println();
                num++;
            }
        }
    }