/*

Enter the row:4
a B c D 
  E f G 
    h I 
      J  
      
      */

      import java.io.*;
      class Program5{
        public static void main(String[] args) throws IOException{
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row");
            int row = Integer.parseInt(br.readLine());
            
            char ch=97;
            char ch1=65;

            for(int i=0;i<row;i++){
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=0;j<row-i;j++){
                    if(i%2==0){
                        if(j%2==0){
                    System.out.print(ch+" ");
                        }else{
                            System.out.print(ch1+" ");
                        }
                    }else{
                        if(j%2==0){
                        System.out.print(ch1+" ");
                        }else{
                            System.out.print(ch1+" ");
                        }
                    }
                    ch++;
                    ch1++;
        
                }

                System.out.println();
            }
        }
      }