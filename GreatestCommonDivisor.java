package challange.challengeVVI;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num1= input.nextInt();
        System.out.println("enter your number:");
        int num2 = input.nextInt();
        
        int gcd = gcd(num1, num2);

        System.out.println("your GCD is:" +gcd);

    }
    public static int gcd(int first , int second){
        int gcd = 1;
        int i = 2;
        int least = least(first , second);

        while (i <=least){
            if (first % i == 0 && second % i == 0){

                gcd = i;

            }
           i++;
        }
        return gcd;






    }

    public static int least(int pahla , int dusra ){
        if(pahla<dusra){
            return pahla;

        }
        else {
            return dusra;
        }





    }
}
