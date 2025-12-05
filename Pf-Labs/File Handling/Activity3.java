import java.io.*;
public class Activity3 {
    public static void main(String[] args){
        int rno =101;
        String name = "Muzaffar";
        int marks = 88;
        try {
            FileOutputStream fos = new FileOutputStream("D:\\user\\Desktop\\SEMS 1\\PF\\Lab 13\\test.txt");
                PrintWriter writer = new PrintWriter(fos);

                writer.println(rno);
                writer.println(name);
                writer.println(marks);
                System.out.println("Successfully Written");
                writer.close();

            
        } catch (IOException e) {
            System.out.println("An error has occurred");

        }
    }
}
