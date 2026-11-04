package Mastery;


import java.io.*;
import java.util.Scanner;

public class CountVowels 
{
    public static void main(String[] args) 
    {
        File textFile;
        FileReader in;
        BufferedReader readFile;
        String fileName;
        String lineInFile, lowercaseText, letter;
        int vowelSum = 0;

        Scanner input = new Scanner(System.in);

        /* prompt the user for the name of the file */
        System.out.print("Enter the name of the file: ");
        fileName = input.nextLine();

        /* count the vowels in the file */
        try {
            // new File object required
            textFile = new File(fileName);

            // new File reader object required
            in = new FileReader(textFile);

            // new BufferedReader object required
            readFile = new BufferedReader(in);

            // read the lines from the file
            while ((lineInFile = readFile.readLine()) != null) 
            {
                // convert the text to lower case
                lowercaseText = lineInFile.toLowerCase();

                // iterate through the lower case text
                for (int i = 0; i < lowercaseText.length(); i++) 
                {
                    // get each character
                    letter = lowercaseText.substring(i, i + 1);

                    // check if the character is a vowel
                    if (letter.equals("a") || letter.equals("e") ||
                        letter.equals("i") || letter.equals("o") ||
                        letter.equals("u")) 
                    {
                        // update total vowels
                        vowelSum++;
                    }
                }
            }

            // display the number of vowels
            System.out.println("The file " + fileName +
                               " contains " + vowelSum + " vowels.");

            // close BufferedReader object
            readFile.close();

            // close FileReader object
            in.close();

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }

        input.close();
    }
}
