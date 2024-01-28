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
        System.out.println("The maximum number of books your bookstore can contain is: \n");

        Book[] inventory;
        Scanner sc = new Scanner(System.in);
        int selection;

        do { // We create a do while loop so that the selection menu is prompted at least once to the user.
        System.out.println("What do you want to do?");
        System.out.println("\t 1. Enter new books (password required)");
        System.out.println("\t 2. Change information of a book (password required)");
        System.out.println("\t 3. Display all books by a specific author");
        System.out.println("\t 4. Display all books under a certain a price.");
        System.out.println("\t 5. Quit");
        System.out.print("Please enter your choice > ");
        selection = sc.nextInt();
        } while (selection > 5 || selection < 1);
        
        // Option 1:


    }
}
