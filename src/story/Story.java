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
      int total =0;
      String firstName;
      String awnser;
      String rangedVsMelee;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Hello there traveler, before you can continue, I need to fill out your profile."
              + "So first things first, Whats your name.");
        firstName = sc.nextLine();
      
      System.out.println("Nice name " + firstName +", now I need your age if you can.");
      number1 = sc.nextInt();
      
      System.out.println("Ok, one more thing, your hight. ");
      number2 = sc.nextDouble();
       
      System.out.print("Perfect, now that you profile is done, lets run you through some basic math, ok. ");      
      awnser = sc.nextLine();
      sc.nextLine();
              
       
      System.out.print("So whats 25 divided by 50? ");
      number3 = sc.nextDouble();
       
      System.out.println("Nice. Ok, now whats 17+32-20");
      number4 = sc.nextInt();
       
      System.out.println("Good job mate, now we just gotta get you armed. so what fighting style do you prefer, ranged or melee");
      sc.nextLine();
      rangedVsMelee = sc.nextLine();
       
      System.out.println( "Hm " + rangedVsMelee + ", nice choice");
      sc.nextLine();
      
      System.out.println("Now what type of " + rangedVsMelee + " do you prefer");
    }
    
}
