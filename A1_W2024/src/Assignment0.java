// --------------------------------------------------------------
// Assignment 1
// Question: (include question/part number, if applicable)
// Explanation of the program: 
// Written by: Botao Yang (40213554)
// --------------------------------------------------------------

import java.util.Scanner;
public class Assignment0 {
    public static void main(String[] args) throws Exception {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                 Welcome To The Book Store Inventory Checker!                  |"); // Prompt user with welcome banner
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        // Declaration and initialization of all variables:
        Book[] inventory;

        final String password = "249"; // The password is initialized as a String as a password can be anything including numbers
        Scanner sc = new Scanner(System.in);
        int selection;

        System.out.println("The maximum number of books your bookstore can contain is: \n");

        do { // We create a do while loop so that the selection menu is prompted at least once to the user.
        System.out.println("What do you want to do?");
        System.out.println("\t1. Enter new books (password required)");
        System.out.println("\t2. Change information of a book (password required)");
        System.out.println("\t3. Display all books by a specific author");
        System.out.println("\t4. Display all books under a certain a price.");
        System.out.println("\t5. Quit");
        System.out.print("Please enter your choice > ");
        selection = sc.nextInt();
        } while (selection > 5 || selection < 1);
        
        switch(selection) {

            case 1:

            int attempts = 0; // A variable is needed to track the number of attempts made
            do {
                System.out.print("Please enter admin password: ");
                String inputedPassword = sc.next();

                if (inputedPassword.equals(password)) {
                    System.out.println("valid!");
                    break;
                }

                else {
                    System.out.println("Incorrect password!");
                    attempts++;
                    }

            } while (attempts < 3);
                
            // In the case the user failed to enter the password 3 times, the code will let the user know the program will shutdown:
            if (attempts == 3) {
                System.out.println("Sorry, you have reached the limit of attempts allowed. The program will now shutdown!");
                System. exit(0);
            }
            // ---------------------------------------------------------------------------------------------------------------------

        }


    }
}
