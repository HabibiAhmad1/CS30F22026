package Mastery;


import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class WordGuess
{
    public static void main(String[] args)
    {
        final String FLAG = "!";

        // Create a File object
        File wordFile = new File("../Chapter11/src/words.txt");

        // Declare a File reader object
        FileReader in;

        // Declare a BufferedReader object
        BufferedReader readFile;

        // Create a random number object
        Random r = new Random();

        int numWords, wordToGuess;
        String secretWord = "";
        String wordSoFar = "", updatedWord = "";
        String letterGuess, wordGuess = "";
        int numGuesses = 0;

        /* select secret word */
        try
        {
            // Initialize the file reader object
            in = new FileReader(wordFile);

            // Initialize the BufferedReader object
            readFile = new BufferedReader(in);

            // Get the number of words in the file
            numWords = Integer.parseInt(readFile.readLine());
            		//countWords();
            
            
            // Select a random word
            wordToGuess = r.nextInt(numWords) + 1;

            // Iterate through the word slots
            for (int i = 0; i < wordToGuess; i++)
            {
                secretWord = readFile.readLine();
            }

            // Close the readers
            readFile.close();
            in.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        catch (IOException e)
        {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
            return;
        }

        /* begin the game */
        System.out.println("WordGuess game.\n");

        // Create dashes representing the secret word
        for (int i = 0; i < secretWord.length(); i++)
        {
            wordSoFar += "-";
        }

        System.out.println(wordSoFar + "\n");

        /* allow player to make guesses */
        Scanner input = new Scanner(System.in);

        do
        {
            // Prompt for a letter
            System.out.print("Enter a letter (" + FLAG
                + " to guess entire word): ");
            letterGuess = input.nextLine();
            letterGuess = letterGuess.toUpperCase();

            /* increment number of guesses */
            numGuesses += 1;

            /* update the word if the letter is correct */
            //This allows for repeated letters
            if (letterGuess.length() == 1 && secretWord.contains(letterGuess))
            {
            	for(int i = 0; i < secretWord.length(); i++)
            	{
            		if(secretWord.substring(i, i + 1).equals(letterGuess))
            		{
            			updatedWord = wordSoFar.substring(0, i);
            			updatedWord += letterGuess;
            			updatedWord += wordSoFar.substring(i + 1);
            			
            			wordSoFar = updatedWord;
            		}
            	}
                
                   

                
            }

            /* display guessed letter instead of dash */
            System.out.println(wordSoFar + "\n");

        } while (!letterGuess.equals(FLAG)
            && !wordSoFar.equals(secretWord));

        /* finish game and display message and number of guesses */
        if (letterGuess.equals(FLAG))
        {
            System.out.print("What is your guess? ");
            wordGuess = input.nextLine();
            wordGuess = wordGuess.toUpperCase();
        }

        if (wordGuess.equals(secretWord) || wordSoFar.equals(secretWord))
        {
            System.out.println("You won!");
        }
        else
        {
            System.out.println("Sorry. You lose.");
        }

        System.out.println("The secret word is " + secretWord);
        System.out.println("You made " + numGuesses + " guesses.");

        input.close();
    }

    
}
