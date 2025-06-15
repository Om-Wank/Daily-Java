/* Take no of rows from the user
   rows=4


   1 2 3 4
   a b c d
   5 6 7 8
   e f g h



 */

 import java.io.*;

 class Program11{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println(("Enter the rows"));
        int row=Integer.parseInt(br.readLine());

        int num=1;
        char ch1=97;

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(i%2==0){
                    System.out.print(ch1+" ");
                    ch1++;
                }else{
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }

    }
 }
