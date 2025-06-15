/* Take no of rows from the user  ROWS=4
          1
	    1 2
	  1 2 3
	1 2 3 4

*/

import java.io.*;
class program1{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the rows:");
		int row=0;
		try{

		 row=Integer.parseInt(br.readLine());
		
		}catch(IOException ex){

		}

		
		for(int i=0;i<row;i++){

			int num=1;

			for(int j=0;j<row-i-1;j++){
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++){
				System.out.print(num);
				num++;
			}

			System.out.println();
		}
	}

}

//    Optimized

/* 
import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        StringBuilder line = new StringBuilder();

        for (int i = 1; i <= rows; i++) {
            line.setLength(0); // Clear previous content

            // Use String.repeat (Java 11+) to add spaces efficiently
            int spaces = rows - i;
            line.append("  ".repeat(spaces)); // Two spaces for alignment

            // Append numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                line.append(j).append(" ");
            }

            System.out.println(line);
        }

        scanner.close();
    }
}
	*/
