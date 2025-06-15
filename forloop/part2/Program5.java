/* write a program to print the following pattern
  row=4

        0 1 2 3 4
    0   0
    1   1 1
    2   2 3 5
    3   8 13 21 34


  */

  import java.io.*;

  class Program5{

        public static void main(String[] args)throws IOException{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the Rows :");
            int row=Integer.parseInt(br.readLine());

            int a=0;
            int b=1;
            int c=a+b;

            for(int i=0;i<row;i++){
                for(int j=0;j<=i;j++){
                    if(i==0 && j==0){
                        System.out.print(a+" ");
                    } else if(i==1 && j==0) {
                        System.out.print(b+" ");
                    } else {
                        
                        System.out.print(c+" ");
                        a=b;
                        b=c;
                        c=a+b;

                    }
                }
                System.out.println();
            }
        }
  }
