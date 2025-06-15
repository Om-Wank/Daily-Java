/* Take no of Rows from the user     ROWS=3
    a B c
    d E f
    g H i
    */

import java.io.*;

class Program4{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=1;

        System.out.println("Enter the rows :");
        int row=Integer.parseInt(br.readLine());

        char ch1=97;
        char ch2=65;

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j%2==0){
                    System.out.print(ch1+" ");
                }else{
                    System.out.print(ch2+" ");
                }
                ch1++;
                ch2++;
            }
            System.out.println();
        }
    }
}
