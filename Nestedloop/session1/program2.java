/* WAP to print the number divisible by 3 and 7 between a given range from user start the range from reverse
input: Enter start  30
       Enter end    80
output      63    42
*/

import java.io.*;

class program2{

       public static void main(String[] args)throws IOException{

              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

              System.out.println("Enter the start number :");
              int start=Integer.parseInt(br.readLine());

              System.out.println("Enter the end number :");
              int end=Integer.parseInt(br.readLine());

              for(int i=end;i>=start;i--){
                     if(i%3==0 && i%7==0){
                            System.out.print(i+" ");
                     }
              }
       }
}