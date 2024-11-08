package challange.challengeVVI;

import java.util.Scanner;

public class LoopPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we are here to prints pattern\n");
        System.out.println("please enter your rows");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        PrintLeftHalfPyramid(rows);

        
    }
    public static void PrintLeftHalfPyramid(int maxRows){
        System.out.println("\n here is the left half pyramid:");
        int rows = maxRows;
        while(rows > 0){
            //this loop prints space
            int j = 0;
            while(j < rows-1){
                System.out.print("  ");
                j++;
            }


            //this loop prints stars
            int i = 0;
            while(i <= (maxRows-rows)){
            System.out.print("* ");
            i++;


            }
            System.out.println();
            rows--;

        }
      
    }

    public static void printReverseRightHalfPyramid(int maxRows){
        System.out.println("\n here is rverse RightHalfPyramid: ");
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void printRightHalfPyramid(int maxRows){
        System.out.println("here is the right half pyramid:");
        int rows  = 0;
        while(rows < maxRows){
            System.out.print("*");
            
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    
}
