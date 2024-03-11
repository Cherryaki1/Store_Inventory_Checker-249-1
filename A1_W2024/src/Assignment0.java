// --------------------------------------------------------------
// Assignment 1
// Question: (include question/part number, if applicable)
// Explanation of the program: 
// Written by: Botao Yang (40213554)
// --------------------------------------------------------------

import java.util.Scanner;
public class Assignment0 
{
    public static void main(String[] args) 
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                 Welcome To The Book Store Inventory Checker!                  |"); // Prompt user with welcome banner
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        System.out.print("Please input the maximum number of books your bookstore can contain: ");
        Scanner sc = new Scanner(System.in);

        // Declaration and initialization of all variables:
        int maxBooks = sc.nextInt();
        Book[] inventory = new Book[maxBooks];

        final String password = "249"; // The password is initialized as a String as a password can be anything including numbers
        

        int selection; // Variable determining the selection from the selection menu
        int attempts = 0; // This variable tracks the total number of attempts made (Terminate program at 12 attempts)

        do 
        { // We create a do while loop so that the selection menu is prompted at least once to the user.
            System.out.println("What do you want to do?");
            System.out.println("\t1. Enter new books (password required)");
            System.out.println("\t2. Change information of a book (password required)");
            System.out.println("\t3. Display all books by a specific author");
            System.out.println("\t4. Display all books under a certain a price.");
            System.out.println("\t5. Quit");
            System.out.print("Please enter your choice > ");
            selection = sc.nextInt();
        
        switch(selection) 
        {
            // ------
            case 1:
            // ------

            int tempAttempts = 0; // A temporary attempt amount tracker for each itteration (Back to menu after reaching 3)
            do 
            {
                System.out.print("Please enter admin password: ");
                String inputedPassword = sc.next();

                if (inputedPassword.equals(password)) // VALID PASSWORD: Option 1 executes
                {
                    System.out.print("Please input the amount of books you wish to add: ");
                    int addAmount = sc.nextInt();
                    if ((Book.findNumberOfCreatedBooks() + addAmount) <= maxBooks)
                    {
                        for (int i = 0 ; i < addAmount ; i++) // This loop prompts the user to input the book's information (itterates as many times as the amount of books he wanted to add)
                        {
                        String garbageString = sc.nextLine();
                        System.out.println("Kindly provide the book's information");
                        System.out.print("Author: ");
                        String Author = sc.nextLine();
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("ISBN: ");
                        long ISBN = sc.nextLong();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();

		                inventory[Book.findNumberOfCreatedBooks()] = new Book(Author, title, ISBN, price);
                        System.out.println(""); // Blank line between book entries (less cluttered interface)
                        }
                    }

                    else
                    {
                        System.out.println("Sorry, the remaining amount of books you can add is " + (maxBooks - Book.findNumberOfCreatedBooks()));
                    }

                    break;
                }

                else 
                {
                    System.out.println("Incorrect password!");
                    tempAttempts++; // Temporary count increments to break out of the loop at 3
                    attempts++; // Counter of total attempts made so terminte once reached 12
                }
            } while (tempAttempts < 3);
                
            // In the case the user failed to enter the password 12 times TOTAL, the code will let the user know the program will shutdown:
            if (attempts == 12) 
            {
                System.out.println("Program detected suspicious activities and will terminate immediately!");
                System. exit(0);
            }
            System.out.println(""); // Blank line between last password attempt & the menu reapearing (less cluttered interface)
            selection = 0; // Before breaking out of the loop, we have to reset selection to an int outside of the while loop range to make the menu reapear
            break;

            // ------
            case 2:
            // ------

            tempAttempts = 0;
            do 
            {
                System.out.print("Please enter admin password: ");
                String inputedPassword = sc.next();

                if (inputedPassword.equals(password)) // VALID PASSWORD: Option 2 executes
                {
                    
                    int choice = 1; // By default, this do while loop will continue iterating if the user doesnt change it's value inside the loop
                                    // Hency why by selecting option 1 in the inner loop, the user willingly opts to reitterate this loop asking for a book to update
                    do
                    {
                        System.out.print("Which book would you like to update? ");
                        int bookModify = sc.nextInt();
                        System.out.println(""); // Add Blank Line
                        if (inventory[bookModify] == null)
                        {
                            System.out.println("There is no book at the provided index. Please select one of the following:");
                            
                            boolean loop = true; // If the user inputs anything besides 1 or 2, they will constantly loop inside this section
                            do
                            {
                            System.out.println("1. Re-enter another book to modify\n2. Return to the main menu");
                            System.out.print("Please enter your choice > ");
                            choice = sc.nextInt();
                            System.out.println(""); // Add Blank Line
                            if (choice == 1)
                            {
                                loop = false; // By chosing 1, the user breaks out of this boolean loop and is prompted to enter a new book index
                            }
                            else if (choice == 2)
                            {
                                break; // By chosing 2, the user will break out of the entire loop bringing them back to the main menu
                            }
                            else 
                            {
                                System.out.println("Your input does not match one of the selections. Please try again."); 
                                continue;
                            }
                            } while (loop == true);
                        }
                        else
                        {
                            int modSelection;
                            do
                            {

                                System.out.println("Here is the current information of the book you have selected:\n" + inventory[bookModify]);
                                System.out.println("What information would you like to change?");
                                System.out.println("\t1. author");
                                System.out.println("\t2. title");
                                System.out.println("\t3. ISBN");
                                System.out.println("\t4. price");
                                System.out.println("\t5. Quit");
                                System.out.print("Enter your choice > ");
                                modSelection = sc.nextInt();

                                switch (modSelection)
                                {
                                    case 1:
                                    sc.nextLine(); // Garbage collector to clear the previous nextInt() value
                                    System.out.print("Please provide the new author: ");
                                    String newAuthor = sc.nextLine();
                                    inventory[bookModify].setAuthor(newAuthor);
                                    System.out.println(inventory[bookModify]);
                                    break;

                                    case 2:
                                    sc.nextLine(); // Garbage collector to clear the previous nextInt() value
                                    System.out.print("Please provide the new title: ");
                                    String newTitle = sc.nextLine();
                                    inventory[bookModify].setTitle(newTitle);
                                    System.out.println(inventory[bookModify]);
                                    break;

                                    case 3:
                                    sc.nextLine(); // Garbage collector to clear the previous nextInt() value
                                    System.out.print("Please provide the new ISBN: ");
                                    long newISBN = sc.nextLong();
                                    inventory[bookModify].setISBN(newISBN);
                                    System.out.println(inventory[bookModify]);
                                    break;

                                    case 4:
                                    sc.nextLine(); // Garbage collector to clear the previous nextInt() value
                                    System.out.print("Please provide the new price: ");
                                    double newPrice = sc.nextDouble();
                                    inventory[bookModify].setPrice(newPrice);
                                    System.out.println(inventory[bookModify]);
                                    break;

                                    case 5:
                                    break;
                                }

                            } while(modSelection != 5);
                            

                        }

                        break; // Breaks out of do while loop for book index selection

                    } while(choice == 1);
                    
                    break; // Breaks out of password check loop. Brings us back to main menu
                } 

                else 
                {
                    System.out.println("Incorrect password!");
                    tempAttempts++; // Temporary count increments to break out of the loop at 3
                }
            } while (tempAttempts < 3);

            System.out.println(""); // Blank line between last password attempt & the menu reapearing (less cluttered interface)
            selection = 0; // Before breaking out of the loop, we have to reset selection to an int outside of the while loop range to make the menu reapear
            break;

            // ------------------------------------------------------------------------
            case 3:
            // ------------------------------------------------------------------------
            String garbageString = sc.nextLine();
            System.out.print("Please provide the name of the author you would like to search up: ");
            String authorSearch = sc.nextLine();
            System.out.println(""); // Add Blank Line

            for (int i = 0 ; i < Book.findNumberOfCreatedBooks() ; i++)
                {
                    if (authorSearch.equals(inventory[i].getAuthor()))
                    System.out.println(inventory[i]);
                }
                selection = 0; // Before breaking out of the loop, we have to reset selection to an int outside of the while loop range to make the menu reapear
                break;

            // ------
            case 5:
            // ------
            System.out.println("Thank you for using the Book Store Inventory Checker. The system will now shutdown!");
            System. exit(0);

        }
        
        } while (selection > 5 || selection < 1);
    }
}
