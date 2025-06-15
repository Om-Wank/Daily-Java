/* Take no of rows from the user     ROWS=4
     10
	 I H
	 7 6 5
	 D C B A

	 */

	 import java.io.*;
	 class Program10{

		public static void main(String[] args)throws IOException{

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the row:");
			int row=Integer.parseInt(br.readLine());

			int num=(row*(row+1))/2;
			char ch=65;
			for(int i=0;i<row;i++){
				for(int j=0;j<=i;j++){
					if(i%2==0){
						System.out.print(num+" ");
					}else{
						
						System.out.print((char)(ch+(row*(row+1))/2-1)+" ");
					}
					ch--;
					num--;
				}
				System.out.println();
			}


		}
	 }