/* WAP to print the factorial of given input number from user
 */

 import java.io.*;
 class program1{

    public static void main(String[] args)throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int num=Integer.parseInt(br.readLine());

        int mult=1;
        for(int i=1;i<=num;i++)
        mult=mult*i;

        System.out.println(mult);



    }
 }