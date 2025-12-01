import java.util.*;

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);

    // Login Credentials

        static String adminUser = "admin";
        static String adminPass = "786";

        static String studentUser = "student";
        static String studentPass = "786";

    public static void main(String[] args) {

        while (true) {
            String loginChoice = loginMenu();

            if (loginChoice == 1) {
                boolean ok = adminLogin();
                if (ok)
                     adminMenu();
            }
            else if (loginChoice == 2) {
                boolean ok = studentLogin();
                if (ok)
                     studentMenu();
            }
            else if (loginChoice == 3) {
                System.out.println("Exiting.");
                break;
            }
        }
    }

    // LOGIN MENU

    static String loginMenu() {
        System.out.println("\n--- Login Menu ---");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
        String choice = sc.nextLine();
        return choice;
    }

    static boolean adminLogin() {
        System.out.println("\n--- Admin Login ---");
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        if (u.equals(adminUser) && p.equals(adminPass)) {
            System.out.println("Login Successful.");
            return true;
        } 
        else {
            System.out.println("Invalid Credentials. Try again.");
            return false;
        }
    }

    static boolean studentLogin() {
        System.out.println("\n--- Student Login ---");
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        if (u.equals(studentUser) && p.equals(studentPass)) {
            System.out.println("Login Successful.");
            return true;
        } 
        else {
            System.out.println("Invalid Credentials. Try again.");
            return false;
        }
    }

    // ADMIN MENU

    static void adminMenu() {

        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book Info");
            System.out.println("4. Search Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. View History");
            System.out.println("8. Logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1)
                 addBook();
            else if (choice == 2)
                 viewBooks();
            else if (choice == 3)
                 updateBookInfo();
            else if (choice == 4)
                 searchBook();
            else if (choice == 5)
                 issueBook();
            else if (choice == 6)
                 returnBook();
            else if (choice == 7)
                 viewHistory();
            else if (choice == 8)
                 break;
            else
                System.out.println("Invalid Choice.");
        }
    }

    // STUDENT MENU

    static void studentMenu() {

        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Search Book");
            System.out.println("2. Check Availability");
            System.out.println("3. View Borrowed Books");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1)
                 searchBookStudent();
            else if (choice == 2)
                 checkAvailability();
            else if (choice == 3)
                 viewBorrowedBooks();
            else if (choice == 4)
                 break;
            else
                System.out.println("Invalid Choice.");
        }
    }

    // EMPTY METHODS

    static void addBook() {
        // Add book features, done by admin (coming soon)
    }

    static void viewBooks() {
        // View books, done by admin (coming soon)
    }

    static void updateBookInfo() {
        // Update book Info, done by admin (coming soon)
    }

    static void searchBook() {
        // Search books using different features, done by admin (coming soon)
    }

    static void issueBook() {
        // Issue book, done by admin (coming soon)
    }

    static void returnBook() {
        // Add into record, done by admin (coming soon)
    }

    static void viewHistory() {
        // View history of students whom borrowed books, done by admin (coming soon)
    }

    static void searchBookStudent() {
        // Book searched by student using different features (coming soon)
    }

    static void checkAvailability() {
        // Check book availability, done by student (coming soon)
    }

    static void viewBorrowedBooks() {
        // Viewing the books oneself borrowed, done by student (coming soon)
    }
}
