/* write a program to print a series of prime a series number from entered range
 input start:10
       end:100

output:
11 13 17 19.........89 97

*/

import java.io.*;

class program3{
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the start number");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter the end number");
        int end=Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    break;
                }else{
                    System.out.print(i+ " ");
                    break;
                }
            }
            
        }



    }
}