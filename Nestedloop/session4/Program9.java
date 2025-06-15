/*Take no of rows from the user  ROWS=4

D C B A
C B A
B A
A

*/
import java.io.*;
class Program9{

    public static void main(String[] args)throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());

        char ch=65;
        for(int i=0;i<row;i++){
            char ch2=ch;
            for(int j=0;j<row-i;j++){
                System.out.print((char)(ch2+row-1)+" ");
                ch2--;
            }
            System.out.println();
            ch--;
        }
    }
}