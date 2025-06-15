/* Tack no of rows from the user 
   Input ROWS=4
  d d d d
  c c c c
  b b b b
  a a a a
 

*/
import java.io.*;

class program3{

  public static void main(String[] args)throws IOException{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the rows :");
    int row=Integer.parseInt(br.readLine());

    char ch1=97;

    for(int i=0;i<row;i++){
      for(int j=0;j<row;j++){

        System.out.print((char)((ch1+row)-1)+" ");

      }
      System.out.println();
      ch1--;
    }

  }
}