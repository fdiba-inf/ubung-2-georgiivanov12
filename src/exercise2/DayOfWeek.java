package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
         System.out.print("eine Zahl zwischen 1 und 7 eingeben:");
          int x =input.nextInt();
          if (x == 1) {
            System.out.println("Day of the week: Monday");
          } 
          else if (x == 2) {
            System.out.println("Day of the week: Tuesday");
           }
          else if (x==3)  {
            System.out.println("Day of the week: Wednesday");
            }
          else if (x==4)  {
            System.out.println("Day of the week: Thursday");
          }         
          else if (x==5)  {
          
            System.out.println("Day of the week: Friday");
          }
          else if (x==6)   {
            System.out.println ("Day of the week: Saturday");
          }
          else if (x==7)   {
            System.out.println ("Day of the week: Sunday");
          }  
          else {
            System.out.println("Invalid day");
          }
    }
 }
    
    