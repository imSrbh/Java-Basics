// Wap a java program to check whether the given number is positive or negative or natural number

import java.util.Scanner;
public class PosNeg
{
    public static void main(String[] args) 
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = scanner.nextInt();
        if(n > 0)
        {
            System.out.println("The given number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }
    }
}