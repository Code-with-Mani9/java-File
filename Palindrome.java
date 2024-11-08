package challange.challengeVVI;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean ispalindrome = ispalindrome(num);
        if (ispalindrome){
            System.out.println("number is a palindrome");



        }
        else{
            System.out.println("number is not a palindrome");
        }
        

    }

    public static boolean ispalindrome(int num){
       
        
        return num == reverse(num);


       
    }

    public static int reverse(int num){
        int newNum=0;
      

        while(num > 0){
            int digit = num %  10;
            newNum = newNum * 10 + digit;

            num /=10;


        }

        return newNum;
    }
    
}

    

    

