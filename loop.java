package Loop;

import java.util.Scanner;

public class loop {
    
   public static void main(String[] args){
        // int num = 1;
        
        // while (num <=100000 ) {
        //     System.out.println(num);

        //     num = num + 1;


        //     //in  this code we are put the loop in increasing(+) order
            
        // }





        // //in the following code we learn loop in decreasing(-) order
        // int count = 500000;

        // while( count >=200){
        //     System.out.println(count);

        //     count = count-100000;
        // }





        //in this code we learn about take input and stop the loop

        Scanner input = new Scanner(System.in);
        System.out.println("enter any number:");

        int i = 0;


        while(i < 5){
            int inp = input.nextInt();
            System.out.println("number is:" +inp);
            i++;

        }




    }

}
