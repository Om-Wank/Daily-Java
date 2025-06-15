/* Enter the Rows:4
1 2 3 4 
  2 3 4 
    3 4 
      4  
      
      */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program6{

        public static void main(String[] args) throws IOException{
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the row:");
            int row=Integer.parseInt(br.readLine());

            int num=1;
            for(int i=0;i<row;i++){
                int num1=num;
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }

                for(int j=0;j<row-i;j++){
                    System.out.print(num1+" ");
                    num1++;
                }
                num++;
                System.out.println();
            }
        }
      }