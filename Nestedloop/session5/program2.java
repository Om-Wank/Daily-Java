/* Take no of rows from the user ROWS=4
                4
		      4 3
		    4 3 2
	      4 3 2 1
	      */

import java.io.*;		  
class program2{

	public static void main(String[] args){

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the row");

		int row=0;
		try{
		
			row=Integer.parseInt(br.readLine());

		}catch(IOException ex){

		}

		
		for(int i=0;i<row;i++){

			int num=row;
			for(int j=0;j<row-i-1;j++){
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++){
				
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}
}
