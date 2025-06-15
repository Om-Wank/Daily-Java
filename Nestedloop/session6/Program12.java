/* Enter the ROWS:4
A b C d 
  F g H 
    K l 
      P 
      
      */

      import java.io.*;

      class Program12{

        public static void main(String[] args)throws IOException{

            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the Row:");
            int row = Integer.parseInt(br.readLine());

            char ch=65;
            char ch1=97;

            for(int i=0;i<row;i++){

                for(int j=0;j<i;j++){
                    System.out.print("  ");
                    ch++;
                    ch1++;
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