/** 
 * 6122403
 * Title: Lab2b 
 * Semester:         COP2250 - Spring 2018
 * Lecturer's Name:  Cristy Charters
 * Description of Program’s Functionality:
 * The program will ask for your first name , will read it and then print it on 
  the screen,  after that it will ask for your last name, read it and print it
  too. Then is going to print in the screen your full name. (task 1) 
   
  * The program will read the first character of your name and will print it on 
   the screen. Then is going to print your full name in capital letters. Finally
   is going to print a message with your name and how many characters it has 
   counting the parenthesis. (task 2)
   
 */
package lab2b; 



/**
 *
 * @author Charters
 */

//LAB 2B
import java.util.Scanner; //TASK #1 Add import statement here to use the Scanner class
import javax.swing.JOptionPane; //TASK #1 (Alternate) Add import statment to use JOptionPane class

public class Lab2b
{

    public static void main(String[] args)
    {
         String firstName;//declare additional variables here(i.e. firstName)
         String lastName; 
         String fullName; 
         char firstInitial; 
         Scanner keyboard = new Scanner(System.in); //TASK #1 Create a Scanner object here (not used for alternate)

        // ADD LINES FOR TASK #1 HERE 
        System.out.println("Which is your first name?");// prompt the user for first name
        firstName = keyboard.nextLine();// read the user's first name

        System.out.println("Which is your last name?");// prompt the user for last name
        lastName = keyboard.nextLine();// read the user's last name

        fullName = firstName +" "+ lastName; // concatenate the user's first and last names
        
        System.out.print(fullName);// print out the user's full name

        System.out.println(); // to leave a blank line

        // ADD LINES FOR TASK #2 HERE
         firstInitial = firstName.charAt(0);// get the first character from the user's first name

         System.out.print(firstInitial); // print out the user's first initial
         System.out.println();
        
         String upperName; 
         upperName = fullName.toUpperCase(); // convert the user's full name to all capital letters
        
         System.out.print(upperName);// print out the user's full name in all capital letters
         System.out.println();
          
         int len = fullName.length(); // and number of characters in it
         System.out.println("The name is " + fullName + ", that has " + len + " characters on it.");
         System.out.println(); // to leave a blank line

    }
}