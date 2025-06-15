/* write a program to print the following pattern
        row=5

       O
      14 13
       L K J
       9 8 7 6
       E D C B A       
	
       ROW=4

       10
       I  H
       7 6 5
       D C B A
       */

       import java.io.*;
       class Program7{

        public static void main(String[] args)throws IOException{

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the row value");
            int row=Integer.parseInt(br.readLine());

            int num1=(row*(row+1))/2;
            char ch1=65;

            for(int i=0;i<row;i++){
                for(int j=0;j<=i;j++){
                   if(row%2==0){

                        if(i%2!=0){

                        System.out.print((char)(ch1+(row*(row+1))/2-1)+" ");  

                        }else{

                            System.out.print(num1+" ");
                   

                        }


                    }else{

                        if(i%2!=0){

                          System.out.print(num1+" ");

                        }else{
                        System.out.print((char)(ch1+(row*(row+1))/2-1)+" ");

                                
                        }
                    }
                        
                    num1--;
                    ch1--;
                  
                }
                System.out.println();
            }


        }
       }