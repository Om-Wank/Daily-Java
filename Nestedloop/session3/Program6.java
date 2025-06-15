/* Take no of rows from the user     ROWS=4
  4 
  3 3
  2 2 2
  1 1 1 1



  */
  import java.io.*;

  class Program6{
    
    public static void main(String[] args)throws IOException{

      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the row");
      int row=Integer.parseInt(br.readLine());

      int num=row;
      for(int i=0;i<row;i++){
        for(int j=0;j<=i;j++){

          System.out.print(num+" ");
        }
        num--;
        System.out.println();
      }

    }
  }