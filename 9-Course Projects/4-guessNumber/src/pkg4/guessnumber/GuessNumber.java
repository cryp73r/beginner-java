/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.guessnumber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author priyanshusingh
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    
    public static int generateRandomInteger(int from, int to) {
        return (int)(from + (Math.random()*to));
    }
    
    public static void main(String[] args) throws IOException {
        int generateNumber = generateRandomInteger(0, 100);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many guesses you want to make? ");
        String userInput = reader.readLine();
        int remainingGuess = Integer.parseInt(userInput);
        while (remainingGuess>0) {
            System.out.print("Your Guess: ");
            userInput = reader.readLine();
            int guessedNumber = Integer.parseInt(userInput);
            if (guessedNumber>generateNumber) {
                System.out.println("You Guessed Bigger Number.");
            }
            else if (guessedNumber<generateNumber) {
                System.err.println("You Guessed Smaller Number.");
            }
            else {
                System.out.println("You Won!");
                break;
            }
            remainingGuess--;
        }
        if (remainingGuess==0) {
            System.out.println("You Lose!");
        }
    }
    
}
