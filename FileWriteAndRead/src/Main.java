//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DOCUMENT: ");
        String userInput = scanner.nextLine();
        String filePath = "text.txt";
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(userInput);
            System.out.println("File has been written!");
        }
        catch (IOException e){
            System.out.println("File not found!");
        }

    }
}