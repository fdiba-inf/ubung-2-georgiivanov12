package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
      System.out.print("einen Zahl zwischen 0 und 999 eingeben: ");
      Scanner scanner=new Scanner(System.in);
      int zahl=scanner.nextInt();
      if (zahl<0 || zahl>999) {
        System.out.println("ne ste wyweli korektno chislo");
        return;
      }
      int c1 = zahl % 10;
      int c2 = (zahl / 10) % 10;
      int c3 = (zahl / 100) % 10;
      int sum = c1 + c2 + c3;
      System.out.println("Sum of digits: " + sum);
    }
}