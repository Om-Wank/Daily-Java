/*  Take no of rows from the user     ROWS=4
      1
      2 4
      3 6 9
      4 8 12 16
       */

       import java.io.*;

       class Program8{

            public static void main(String[] args)throws IOException{
            
                  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                  System.out.println("Enter the row:");
                  int row=Integer.parseInt(br.readLine());

                  for(int i=0;i<row;i++){
                        int num=i+1;
                        for(int j=0;j<=i;j++){
                              System.out.print(num+" ");
                              num=num+i+1;
                        }
                        System.out.println();
                  }
                  
            }
       }