// Ask the user for a first name and a last name and
// create a two digit ID for the person. Create a password.

import java.util.Scanner;
import java.util.Random;

public class NamePassword
{
   public static void main(String[] args)
   {
      // declare var
      String first, last, lastNameSub, r, password, cont = "y";
      char firstNameChar, ch;
      int n1, n2;
      boolean upper = false, lower = false;
      
      // instantiate Scanner object
      Scanner scan = new Scanner(System.in);
      
      // instantiate Random object
      Random rand = new Random();
        
      // get 2 digit random number for the ID
      n1 = rand.nextInt(10);
      n2 = rand.nextInt(10);
      
      // get user input on first name
      System.out.print("Enter the first name: ");
      first = scan.nextLine();
      firstNameChar = first.charAt(0);// get first character 
      
      // get user input on last name
      System.out.print("Enter the last name: ");
      last = scan.nextLine();
      
      //make sure last name is at least 4 characters before
      if(last.length() >= 4) 
         lastNameSub = last.substring(0, 4);
      else
         lastNameSub = last;
      
      //concatenate, convert char to string value first to do operations
      r = String.valueOf(firstNameChar).concat(lastNameSub + n1 + n2);
      System.out.println(r);
      
      // create a password
      System.out.println("Please make a new password.");
      System.out.println("Needs one uppercase.");
      System.out.println("Needs one lowercase.");
      System.out.println("Cannot have spaces.");
      System.out.println("#, $, @ are the only special characters allowed.");
      password = scan.nextLine();

 
   }
}