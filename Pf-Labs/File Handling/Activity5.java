import java.io.*;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rno;
        String name;
        int marks;
        try {
            FileOutputStream fos = new FileOutputStream("D:\\user\\Desktop\\SEMS 1\\PF\\Lab 13\\myfile.txt.txt");
            PrintWriter writer = new PrintWriter(fos);
            while (true){
                System.out.print("Enter Roll Number: ");
                rno = input.nextInt();
                if(rno == 0)
                    break;
                System.out.print("Name ");
                name = input.next();
                System.out.print("Enter Marks ");
                marks = input.nextInt();
                writer.println(rno);
                writer.println(name);
                writer.println(marks);

            }
            System.out.println("Successfully Writter");
            writer.close();

        }

        catch (IOException e) {
            System.out.println("An error has occurred");
        }
    }
}
