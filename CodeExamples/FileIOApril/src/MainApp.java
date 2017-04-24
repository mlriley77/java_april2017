import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Antonella on 4/24/17.
 */
public class MainApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String dirString = "files";
        //createDirectory(dirString);
        String fileString = "test.txt";

        //createFile(fileString);

        writeToFile(scan);

        readFromFile();


    }

    public static void readFromFile() {
        Path filePath = Paths.get("files/test.txt");
        File textFile = filePath.toFile();
        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(Scanner s) {
        System.out.println("Please enter a name for the cat: ");
        String catName = s.nextLine();
        System.out.println("Please enter a type for the cat: ");
        String catType = s.nextLine();
        System.out.println("Please enter an age for the cat: ");
        int catAge = Integer.parseInt(s.nextLine());
        Cat cat = new Cat(catName,catType,catAge);
        Path testPath = Paths.get("files/test.txt");
        File testFiles = testPath.toFile();

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));
            out.println(cat);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void createFile(String fileString) {
        Path filePath = Paths.get(fileString);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);
            }


        }
        System.out.println("File Name: " + filePath.getFileName());
        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
        System.out.println("Is Writeable: " + Files.isWritable(filePath));
    }

    public static void createDirectory(String dirString) {
        Path dirPath = Paths.get(dirString);

        if (Files.notExists(dirPath)) {
            try {
                Files.createDirectories(dirPath);
            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println("There was an error: " + e);
            }
        }
    }
}
