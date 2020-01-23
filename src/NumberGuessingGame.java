
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sneako
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("The CPU has picked a number between 1-50. Try to guess the number: ");
       Scanner in = new Scanner(System.in);
       //int num = in.nextInt();
       boolean done = false;
       int randNumber = (int) (Math.random() * 50)+1;
      
       
       while(!done){
           int num = in.nextInt();
           
           if (num < randNumber){
               System.out.println("Womp womp. Wrong guess. Number is too low.");
               System.out.println("Please guess again: ");
               //num = in.nextInt();
           }
          if (num > randNumber){
               System.out.println("Whoa. Easy there champ. Number is too high.");
               System.out.println("Please guess again: ");
               //num = in.nextInt();
          }
          if (num == randNumber){
              System.out.println("DING! DING! DING! You are correct! Great job!");
              System.out.println("Press 123 to play again or 0 to quit");
              //num = in.nextInt();
          }
              
          if (num == 123){
               randNumber = (int) (Math.random() * 50)+1;
               System.out.println("The CPU has picked a number between 1-50. Try to guess the number: ");
          }    
              
          if (num == 0){
              done = true;
              System.out.println("Thanks for playing!");
          }
              
              
          }
      
    }
    
}
    
