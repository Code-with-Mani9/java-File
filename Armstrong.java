package challange.challengeVVI;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number:");

        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println("your number is Armstrong:");



        }
        else{
            System.out.println("your number is not Armstrong:");
        }


        

    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        System.out.println("number of digits " + noOfDigits);
        int finalNumber = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        System.out.println("final number is :" + finalNumber);
        return finalNumber == num;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i<num2){
            result *=num1;
            i++;
        }
        System.out.println("pow of " + num1 + " is: " +result ); 
        return result;
    }


    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num/=10;
        }
        return digits;
    }

    
}
