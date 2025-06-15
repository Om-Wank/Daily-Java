/* Take no of rows from the user 
  ROWS=4
 	

  	1 2 3 4
	1 2 3
	1 2
	1
	*/

    import java.io.*;
    class program2{

        public static void main(String[] args)throws IOException{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the Rows:");
            int row=Integer.parseInt(br.readLine());
            
            for(int i=0;i<row;i++){
                int num=1;
                for(int j=0;j<row-i;j++){
                    System.out.print(num+" ");
                    num++;
                }
                System.out.println();
            }
        }
    }
