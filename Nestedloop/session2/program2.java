/* Take no of rows from the user 
  Input ROWS=3;
 1 4 7
 10 13 16
 19 22 25

*/
import java.io.*;

class program2{

  public static void main(String[] args)throws IOException{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the rows :");
    int row=Integer.parseInt(br.readLine());

    int num=1;

    for(int i=0;i<row;i++){
      for(int j=0;j<row;j++){
        System.out.print(num+" ");
        num=num+3;
      }
      System.out.println();
    }
  }
}