import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

    public static void main(String[] args){
        //instantiating scanner class
        Scanner scanner = new Scanner(System.in);
        //instantiating random class
        Random rand = new Random();
        
        
        //asking the user what number they want to guess till
        System.out.println("Up to what number do you want to guess? ");
        
        //getting the response and generating the random number between 1 and whatever they picked
        int response = scanner.nextInt();
        int randomNum = rand.nextInt(response) + 1;
     
        //output that says enter your guess from 1 and whatever number player picked
        System.out.println("Enter your guess (1-" + response + "): ");

        //instantiating the amount of time we go through the loop
        int tryCount = 0; 
        
        
        
        //checking if guess is correct
        while(true){
            
            //read the input
            int playerGuess = scanner.nextInt();
            tryCount ++;
            if (playerGuess == randomNum){
                System.out.println("Congratualtions! You guessed correctly! You guessed " + tryCount + " times.");
                break;
            }
            else if (playerGuess < randomNum){
                System.out.println("Guess a bigger number");
            }
            else{
                System.out.println("Guess a smaller numner");
            }

            System.out.println("Re-enter your guess (1-" + response + "): ");

        }

        scanner.close();
    }
} 