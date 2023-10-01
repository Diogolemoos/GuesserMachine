/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessermachine;

import ioutils.IOUtils;
import java.util.Random;


/**
 *
 * @author diogo
 */
public class GuesserMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        int number = r.nextInt(100); //number is now a random int less than 100
        
        //System.out.println(number); //used it to see what was the random number so I could check if the code was working as expected.
        
        IOUtils myInput = new IOUtils();
        
        int[] guesses = new int[10];
        int numGuesses = 0;
        boolean win = false;
        
        while (numGuesses < 10) { // A while loop to keep running and counting for 10 guesses
            int guess = myInput.getUserInt("Guess a number between 0 and 99: ");
            
            
           
        boolean alreadyGuessed = false; // Checking if the guess has already been tried
            
            for (int i = 0; i < numGuesses; i++) { // I used the prompt that doesnt change
                if (guess == guesses[i]) { //Checking the guess inside the Guesses Array
                    alreadyGuessed = true; 
                    System.out.println("THAT WAS A WAST – You have already guessed that number!");
                   
                }
            }
            if (alreadyGuessed) { 
               
            }
            
            guesses[numGuesses] = guess; ////adding the user guesses to the Array.
            numGuesses++; // add the number of guesses.
            
            if (guess == number) { //Checking if the user has guessed the number 
                System.out.println("YOU WIN!");
                win = true;
                break;// Stopping the loop if the player guess rightly.
               
            } else {
                System.out.println("WRONG!");
            }
        }
        
        if (!win) { // If the guesses run out without being sucessful.
            System.out.println("HARD LUCK!");
        }
    }
    
}
