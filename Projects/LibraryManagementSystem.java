import java.util.*;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("\n*** MAIN MENU ***");
            System.out.println("1.Admin Login");
            System.out.println("2.Student Login");
            System.out.println("3.Exit");
            System.out.print("Enter your Choice: ");

            String choice = input.nextLine();

            if (choice.equals("1"))
                {
            adminLogin(input);
                }
            else if (choice.equals("2"))
                {
                studentLogin(input);
                }
            else if (choice.equals("3")) 
                {
                    System.out.print("Thank you! Goodbye!");

                }   
            else 
                {
                    System.out.println("Invalid input! Please enter 1, 2, or 3.");
                }            
        }
        

    }
    public static void adminLogin(Scanner input){
        while (true) {
        System.out.println("\n*** ADMIN LOGIN ***");
        System.out.println("Enter username: ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        if(username.equals("admin") && password.equals("123")) {
            System.out.print("Login Successful!");
            adminMenu(input);
        
        }
        else {
            System.out.println("Invalid Input, Try Again!");
        }
    }

    }

    public static void studentLogin(Scanner input){
        while (true) {
        System.out.println("\n*** STUDENT LOGIN ***");
        System.out.println("Enter username: ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        if(username.equals("Student") && password.equals("456")) {
            System.out.print("Login Successful!");
            studentMenu(input);
        
        }
        else {
            System.out.println("Invalid Input, Try Again!");
        }

    }
    }

    public static void adminMenu(Scanner input){
        while (true) {
            System.out.println("\n*** ADMIN MENU ***");
            System.out.println("1.Add Book");
            System.out.println("2.View Books");
            System.out.println("3.Update Book info");
            System.out.println("4.Search Book");
            System.out.println("5.Issue Book");
            System.out.println("6.Return Book");
            System.out.println("7.View History");
            System.out.println("8.Logout");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

            if (choice.equals("1")) 
                {
                System.out.println("\n*** ADD BOOK ***");
                System.out.println("This will add a new book to library");
                } 
            else if (choice.equals("2")) 
                {
                System.out.println("\n*** VIEW BOOKS ***");
                System.out.println("This will show all books in library");
                } 
            else if (choice.equals("3")) 
                {
                System.out.println("\n*** UPDATE BOOK INFO ***");
                System.out.println("This will update book information");
                } 
            else if (choice.equals("4")) 
                {
                System.out.println("\n*** SEARCH BOOK ***");
                System.out.println("This will search for a book");
                } 
            else if (choice.equals("5")) 
                {
                System.out.println("\n*** ISSUE BOOK ***");
                System.out.println("This will issue a book to student");
                } 
            else if (choice.equals("6")) 
                {
                System.out.println("\n*** RETURN BOOK ***");
                System.out.println("This will return a book from student");
                } 
            else if (choice.equals("7")) 
                {
                System.out.println("\n*** VIEW HISTORY ***");
                System.out.println("This will show borrowing history");
                } 
            else if (choice.equals("8")) 
                {
                 System.out.println("Logging out...");
                 break;
                } 
            else 
                {
                System.out.println("Invalid input! Please enter 1-8 only.");

                }

        }

    }

    public static void studentMenu(Scanner input){
    while (true) {
            System.out.println("\n*** STUDENT MENU ***");
            System.out.println("1.Search Book");
            System.out.println("2.Check Avialability");
            System.out.println("3.View borrowed books");
            System.out.println("4.Logout");
            System.out.print("Enter your choice: ");

            String choice = input.nextLine();

      
            if (choice.equals("1")) 
                {
                System.out.println("\n*** SEARCH BOOK ***");
                System.out.println("This will search for a book");
                } 
            else if (choice.equals("2")) 
                {
                System.out.println("\n*** CHECK AVIALABILITY ***");
                System.out.println("This will show all the avialable books");
                } 
            else if (choice.equals("3")) 
                {
                System.out.println("\n*** VIEW BORROWED BOOKS ***");
                System.out.println("This will show all the borrowed books");
                } 
            else if (choice.equals("4")) 
                {
                 System.out.println("Logging out...");
                 break;
                } 
            else 
                {
                System.out.println("Invalid input! Please enter 1-4 only.");

                }
        }
    }
    }
    

