package interview;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OfficesGen {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\caema\\IdeaProjects\\gazprombank\\offices.txt");
            for (int i = 1000; i <2000 ; i++) {
                System.out.print(i+" ");
                myWriter.write(i+" ");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
