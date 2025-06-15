/*Take no of rows from the user 
  rows=3

  A A A 
  B B B
  C C C

  */

  import java.io.*;

  class Program9{

    public static void main(String[] args)throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());

        char ch1=65;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){

                System.out.print(ch1+" ");
            }
            ch1++;
            System.out.println();
        }

    }
  }