/* Take no of rows & col from the user   ROWS & col =4
        4
      3 6
    2 4 6
  1 2 3 4

  */

  import java.io.*;
  class Program9{

    public static void main(String[] args) throws IOException{
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the row");

      int row=Integer.parseInt(br.readLine());

      int num1=row;
      for(int i=0;i<row;i++){
        int num2=1;
        for(int j=0;j<row-i-1;j++){
          System.out.print(" ");
        }
        for(int j=0;j<i+1;j++){
          System.out.print(num1*num2);
          num2++;
        }
        num1--;
        System.out.println();
      }
    }
  }