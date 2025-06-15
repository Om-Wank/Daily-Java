/* Take the no rows for user   ROWS=4
       
           A
         b a
       C E G
     d c b a
   E G I K M

    */

    import java.io.*;
    class Program7{

      public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the row:");

        int row = Integer.parseInt(br.readLine());

        char ch1=97;  //a
        char ch2=65; //A 

        for(int i=0;i<row;i++){

          for(int j=0;j<row-i-1;j++){
            System.out.print(" ");
          }
          char ch4=ch2;
          char ch3=ch1;
          
          for(int j=0;j<i+1;j++){
            if(i%2==0){
            System.out.print((char)ch4);
            ch4=(char) (ch4+2);
            }
            else{
              System.out.print(ch3);
              ch3--;
            }
          }
          System.out.println();

          ch1++;
          ch2++;

        }
      }
    }