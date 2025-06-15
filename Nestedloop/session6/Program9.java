/* Enter the ROWS:4
A b C d 
  E f G 
    H i 
      J 

 */

 import java.io.*;
 class Program9{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the row");
        int row=Integer.parseInt(br.readLine());

        char ch=65;
        char ch1=97;

        for(int i=0;i<row;i++){

            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<row-i;j++){
                if(j%2==0){
                System.out.print(ch+" ");
                }else{
                    System.out.print(ch1+" ");
                }
                ch++;
               ch1++;
            }
            
            System.out.println();
        }
    }
 }