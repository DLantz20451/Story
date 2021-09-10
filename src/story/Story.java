/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package story;

import java.util.Scanner;

/**
 *
 * @author dlantz
 */
public class Story {

    private static String x;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 =0;
      double number2 =0;
      double number3 =0;
      int number4 =0;
      String firstName;
      String color;
      String snackOfChoice;
      String drinkOfChoice;
      String worstDrink;
      int favNumber =0;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println(" Whats your name.");
        firstName = sc.next();
      
      System.out.println("Whats your age.");
      number1 = sc.nextInt();
      
      System.out.println("Whats your hight. ");
      number2 = sc.nextDouble();
       
      System.out.print("whats a color you like ");      
      color = sc.next();
      
      System.out.println("Whats your favorite number");
       favNumber = sc.nextInt();
       
      System.out.print("Whats 25 divided by 50? ");
      number3 = sc.nextDouble();
       
      System.out.println("Whats 17+32-20");
      number4 = sc.nextInt();
      
      System.out.println("Whats your snack of choice");
      snackOfChoice = sc.next();
      
      System.out.println("Whats your prefered drink");
      drinkOfChoice = sc.next();
      
      System.out.println("Whats a drink you'd want to advoid");
      worstDrink = sc.next();
      
      
      System.out.println("Dear School, this is " + firstName +", and I'm " + number1 + " and I'd "
              + "like to know what is up with the vending machines.");
      
      System.out.println(" First of all it's an ugly brown color, why not have it " + color + 
              " with a " + favNumber + " design, it would look so much better.");
      
      System.out.println(" Second, what is up with the food in there. Half of it is just unliked "
              + "pop tart flavor. You could add in some liked snacks like " + snackOfChoice + ". ");
      
      System.out.println("Also what is up with the drinks, its all just water and disgusting " 
              +worstDrink + " Why not add some " + drinkOfChoice + ".");
      
      System.out.println(" Thirdly, why is the so high up, like I'm " + number2 + ", and even I can't"
              + " see the top section of the vending machine It has 50 rows each with 5 items."
              + " We need to reduce that by " + number3 + ".");
      
      System.out.println(" Now while I know that you can replace the machine and get a knew one"
              + ", I would be willing to donate " + number4 + " to help for the better decor one it.");
      
      System.out.println(" Thank you for your time and patience. " + firstName + "" );
      
    }
    
}
