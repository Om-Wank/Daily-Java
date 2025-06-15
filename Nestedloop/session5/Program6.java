/* Take no of rows from the user  ROWS=5
           5
         5 6 
       5 4 3
     5 6 7 8     
   5 4 3 2 1
   */

   import java.io.*;
   class Program6{

    public static void main(String[] args) throws IOException{
       
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the row");
      int row = Integer.parseInt(br.readLine());

      for(int i=0;i<row;i++){
        int num=row;
        for(int j=0;j<row-i-1;j++){
          System.out.print(" ");
        }
        for(int j=0;j<i+1;j++){
          System.out.print(num);
          num--;
        }
        System.out.println();
      }
    }
   }