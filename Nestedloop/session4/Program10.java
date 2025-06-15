/* Take the no of rows from the user  rows=4
   
   4 3 2 1
   C B A
   2 1
   A

   */

   import java.io.*;

  class Program10{
  public static void main(String[] args)throws IOException{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the rows");
    int row=Integer.parseInt(br.readLine());

    char ch=65;
    int num=row;

    for(int i=0;i<row;i++){
        char ch1=ch;
        int num2=num;

        for(int j=0;j<row-i;j++){

            if(i%2!=0){
                System.out.print((char)(ch1+row-1)+" ");
                ch1--;
            }else{
                System.out.print(num2+" ");
                num2--;
            }


        }
        ch--;
        num--;
        System.out.println();
    }
  }
  }