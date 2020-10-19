package exercise2;
import java.util.Scanner;
public class QuadraticEquation {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a=");  
    double a = input.nextDouble();
    System.out.print("Enter b=");
    double b = input.nextDouble();
    System.out.print("Enter c=");
    double c = input.nextDouble();

    if (a != 0) {
      double disk = b*b - 4*a*c;
      if (disk >= 0){
        double x1 = (-b + Math.sqrt(disk)) / (2*a);
        double x2 = (-b - Math.sqrt(disk)) / (2*a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
      }
      else {
        System.out.println("Imaginary values");
      }
    }
    else {
      if (b != 0) {
        //b*x+c=0
        double x = -c/b;
        System.out.println("x = " + x);
      }
      else {
        if (c != 0) {
          System.out.println("No values");
        }
        else {
          System.out.println("Many values");
        }
      }
    }
 
  }
}




  






 
 
 
 
 
