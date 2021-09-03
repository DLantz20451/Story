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
      int number3 =0;
      int number4 =0;
      int total =0;
      String firstName = x;
      String charName;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Hello there traveler, before you can continue, I need your name.");
        firstName = sc.nextLine();
      
      System.out.println("Nice name +x, now I need your age if you can. ");
      number1 = sc.nextInt();
      
       System.out.println("One more thing, your hight. ");
       number2 = sc.nextDouble();
       
       System.out.print("Perfect, now that the paper work is done, lets see if yoou know basic");
    }
    
}
