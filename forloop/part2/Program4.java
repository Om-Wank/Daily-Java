/* WAP to print all even number in reverse order and odd number in the standars way both separately
   within a range take the start and end from user



		input:Enter the start number-2
      			Enter the end number -9
        2 3 4 5 6 7 8 9

		output :
			8 6 4 2
			3 5 7 9

*/

import java.io.*;

class program4{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start value :");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter the end value :");
        int end=Integer.parseInt(br.readLine());

        for(int i=end;i>=start;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }


    }
}