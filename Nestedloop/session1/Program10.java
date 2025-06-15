/* Take no of rows from the user 
  rows =3;

  1 3 5 
  7 9 11
  13 15 17


  */

  import java.io.*;

  class program10{

    public static void main(String[] args)throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());

        int num=1;

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
  }