/* Take the no of rows from the user ROWS=4
         1
       A b
     1 2 3
   A b C d
          
   */

   import java.io.*;

   class Program8{

    public static void main(String[] args) throws IOException{
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the row");
      int row= Integer.parseInt(br.readLine());

      for(int i=0;i<row;i++){

        for(int j=0;j<row-i-1;j++){

          System.out.print(" ");
        } 

        int num=1;
        char ch1=65;
        char ch2=97;

        for(int j=0;j<i+1;j++){
          if(i%2==0){
          System.out.print(num);
          num++;
          }else{
            if(j%2==0){
            System.out.print(ch1);
            }else{
              System.out.print(ch2);
            }
            ch1++;
            ch2++;

          }
        }

        System.out.println();
      }
    }
   }