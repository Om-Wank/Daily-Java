/* write a program to take a number as input and print the addition of factorials of each digit from that number
      
   input 1234
   output:Addition of factorials of each digit from 1234=33

   */

   import java.io.*;
   class Program9{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int sum=0;
        int mult=1;


        while(x!=0){
            int z=x%10;
            for(int i=1;i<=z;i++){
                mult=mult*i;
            }
            sum=sum+mult;
            mult=1;
            x=x/10;

        }
        System.out.println(sum);
    }
   }