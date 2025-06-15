/* 1. WAP to print the square of odd number between a given range from user
 input :Enter start   10
        Enter End     20

output : 121 169 225 289 361  
*/

import java.io.*;

class program1{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                
                System.out.println("Enter the Start number :");
                int start=Integer.parseInt(br.readLine());

                System.out.println("Enter the end number");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){

                        if(i%2!=0){
                                System.out.print(i*i+" ");
                        }
                }
        }
}