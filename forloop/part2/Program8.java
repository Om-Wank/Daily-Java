/* write a program to print the following pattern
 
   rows=8;

   $                1
   @ @              2
   & & &            3
   # # # #          4
   $ $ $ $ $        5
   @ @ @ @ @ @      6
   & & & & & & &    7
   # # # # # # # #  8


   */

   import java.io.*;

   class Program8 {
   
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
       System.out.println("Enter the rows");
        int row=Integer.parseInt(br.readLine());
        char ch='$';

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            switch (ch) {
                case '$':
                    ch='@';
                    break;

                 case '@':
                    ch='&';
                    break; 
                 case '&':
                    ch='#';
                    break;

                 case '#':
                    ch='$';
                    break;    

                default:
                    break;
            }
                    System.out.println();
        }
    }
   }
    
