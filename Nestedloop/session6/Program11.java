/* Enter the ROWS:4
1 3 5 7 
  9 7 5 
    3 5 
      7  
      
      */
import java.io.*;

class Program11{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Row:");
         int row = Integer.parseInt(br.readLine());

         int num=1;

         for(int i=0;i<row;i++){

            for(int j=0;j<i;j++){
                System.out.print("  ");
            }

            for(int j=0;j<row-i;j++){
                if(i%2==0){
                System.out.print(num+" ");
                num=num+2;
                }else{
                    System.out.print(num+" ");
                num=num-2; 
                }
            }
            System.out.println();
         }

    }
}