package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.print("eine Zahl eingeben:");
      int x = input.nextInt();
      int remainder = x % 2;
      if (remainder == 1)
      {
        System.out.println("Odd number");
      }
      else
      {
        System.out.println("Even number");
      }
    }
}