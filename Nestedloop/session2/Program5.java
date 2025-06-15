/*Take no of rows from the user ROWS=3
    1 2 3 
    2 3 4 
    3 4 5
    */

    import java.io.*;

    class Program5{

        public static void main(String[] args) throws IOException{
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the the row :");
            int row=Integer.parseInt(br.readLine());

            int num=1;
            
            for(int i=0;i<row;i++){
                int num2=num;
                for(int j=0;j<row;j++){
                    System.out.print(num2+" ");
                    num2++;

                }
                num++;
                System.out.println();
            }
        }
    }