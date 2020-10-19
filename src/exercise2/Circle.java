package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("r: ");
    int r=input.nextInt();
    double C=2*Math.PI*r;
    double A=Math.PI*(r*r);
    System.out.println("A:" +A);
    System.out.println("C: "+C);
    
    
    
    
    
    }
}