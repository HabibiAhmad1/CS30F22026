package SkillBuilders;


import java.io.*;
import java.util.Scanner;

public class Roster
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String fileName;
        int numStudents;

        System.out.print("Enter the file name to store the roster: ");
        fileName = keyboard.nextLine();

        System.out.print("Enter the number of students in the class: ");
        numStudents = keyboard.nextInt();
        keyboard.nextLine();

        try
        {
            ObjectOutputStream writeStuName =
                new ObjectOutputStream(new FileOutputStream(fileName));

            for (int i = 0; i < numStudents; i++)
            {
                System.out.print("Enter first name for student " + (i + 1) + ": ");
                String firstName = keyboard.nextLine();

                System.out.print("Enter last name for student " + (i + 1) + ": ");
                String lastName = keyboard.nextLine();

                StuName student = new StuName(firstName, lastName);
                writeStuName.writeObject(student);
            }

            writeStuName.close();

            System.out.println("\nClass Roster:");

            ObjectInputStream readStuName =
                new ObjectInputStream(new FileInputStream(fileName));

            for (int i = 0; i < numStudents; i++)
            {
                System.out.println((StuName) readStuName.readObject());
            }

            readStuName.close();
        }
        catch (IOException e)
        {
            System.out.println("Error accessing the file: " + e.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error reading student data: " + e.getMessage());
        }

        keyboard.close();
    }
}

