/* Take no of rows from the user     ROWS=4
     a
     b c 
     d e f
     g h i j


     */
    import java.io.*;

    class Program5{

     public static void main(String[] args)throws IOException{

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Enter the rows :");
          int row=Integer.parseInt(br.readLine());

          char ch=97;
          for(int i=0;i<row;i++){
               for(int j=0;j<=i;j++){
                    System.out.print(ch+" ");
                    ch++;
               }
               System.out.println();
          }

     }
    }