import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter file to create: ");
        String filename = input.nextLine();   // Read filename

        try {

            File myObj = new File(filename);

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        input.close();
    }
}