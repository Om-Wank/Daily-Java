/* Take no of rows from the user ROWS=3
           1
	     4 7
    10 13 16
    rows=4

             1
	       5 9
	   13 17 21
	25 29 33 37

	*/

	import java.io.*;
	class Program4{

		public static void main(String[] args)throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter the row");
			int row=Integer.parseInt(br.readLine());

			int num=1;
			for(int i=0;i<row;i++){
				for(int j=0;j<row-i-1;j++){
					System.out.print("  ");
				}
				for(int j=0;j<i+1;j++){
					
						System.out.print(num+" ");
				
					num=num+row;
			}
				System.out.println();
			}
		}
	}