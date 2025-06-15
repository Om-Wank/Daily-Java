/* Take no of rows from the user ROWS=4
      d d d d
        c c c
	      b b
	        a

	    */

        import java.io.*;
        class Program4{

            public static void main(String[] args) throws IOException{
                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int row = Integer.parseInt(br.readLine());
                
                char ch =97;
                for(int i=0;i<row;i++){
                    for(int j=0;j<i;j++){
                        System.out.print("  ");
                    }
                    for(int j=0;j<row-i;j++){
                        System.out.print((char)(ch+(row-1))+" ");
                    }
                    ch--;
                    System.out.println();
                }
            }
        }