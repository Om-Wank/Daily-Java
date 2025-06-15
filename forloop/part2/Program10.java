/* write a program to print a series of print a series number from entered range
 input start:10
       end:100

output:
11 13 17 19.........89 97

*/
import java.io.*;

class Program10{

    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Starting number");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter the ending number");
        int end=Integer.parseInt(br.readLine());

        int flag=0;
        for(int i=start;i<=end;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                
            }else{
                System.out.println(i);
            }
            flag=0;
        }

    }
}
