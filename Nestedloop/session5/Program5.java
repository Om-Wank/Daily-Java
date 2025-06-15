/* Take no of rows from the user    ROWS=4
                D 0
		      c D 1
	        B c D 2
	      a B c D 3

	      */
import java.io.*;

class Program5{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the row");
		int row = Integer.parseInt(br.readLine());

		
		for(int i=0;i<row;i++){
			char ch=97;
		char ch1=65;

			for(int j=0;j<row-i-1;j++){
				System.out.print(" ");
				ch++;
				ch1++;
			}
			for(int j=0;j<i+1;j++){
				if(i%2==0){
					if(j%2==0){
				System.out.print(ch1);
					}else{
						System.out.print(ch);
					}
				}else{
					if(j%2==0){
						System.out.print(ch);
					}else{
						System.out.print(ch1);
					}
				}
				ch++;
				ch1++;
			}
			System.out.println();
		}
	}
}		  