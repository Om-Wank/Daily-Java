/* 

Enter the ROWS:4
D D D D 
  c c c 
    B B 
      a  
      
      */
import java.io.*;
      class Program8{

        public static void main(String[] args) throws IOException{
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row:");
            int row=Integer.parseInt(br.readLine());
             
            char ch=65;
            char ch1=97;
            for(int i=0;i<row;i++){
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=0;j<row-i;j++){
                    if(i%2==0){
                    System.out.print((char)(ch+row-1)+" ");
                    }else{
                        System.out.print((char)(ch1+row-1)+" ");
                    }
                }
                ch--;
                ch1--;
                System.out.println();
            }
        }
      }