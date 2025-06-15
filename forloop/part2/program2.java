/* write the program to print the following pattern
 


	# = = = =
    = # = = =
	= = # = =
	= = = # =
	= = = = #


	*/
    import java.io.*;
    class program2{
        public static void main(String[] args)throws IOException{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row");
            int row=Integer.parseInt(br.readLine());

            int x=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    if(x==j){
                    System.out.print("# ");
                    }else{
                        System.out.print("= ");
                    }
                }
                x++;
                System.out.println();
            }

        }
    }