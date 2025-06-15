/* WAP to print the factorial of each number between a given range
        start=1
	end=5
 */

 import java.io.*;
 class Program13 {
 
    public static void main(String[] args)throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start number:");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter the end number:");
        int end=Integer.parseInt(br.readLine());

        int mult=1;
        for(int i=start;i<=end;i++){
            for(int j=1;j<=i;j++ ){
                mult=mult*j;
            }
            System.out.println(mult);
        }
    }
    
 }