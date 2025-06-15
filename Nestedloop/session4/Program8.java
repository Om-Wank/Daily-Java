/* Take no rows from the user   rows=4
 
   d d d d
   C C C
   b b
   A

   rows=3

   c c c
   B B
   a

   */
import java.io.*;
   class Program8{

    public static void main(String[] args)throws IOException {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());

        char CH=65;
        char ch=97;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i;j++){
                
                if(i%2!=0){
                    System.out.print((char)(CH+row-1)+" ");
                }else{
                    System.out.print((char)(ch+row-1)+" ");
                }
            }
            System.out.println();
            CH--;
            ch--;

        }
    }
   }