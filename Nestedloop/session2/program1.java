/* Wap to print th odd number as it is and cude of even numbers between a given range from the user
    Input: Enter Start 10
           Enter End 20
	    Output 1000 11 1728 13 2744 15 4096 17 5832 19 8000
*/

import java.io.*;

class program1{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Start value :");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter the end value :");
        int end=Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.print(i*i+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}