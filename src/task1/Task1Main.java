package task1;

//https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
//Date time PointNumber OperationNumber Operation

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Task1Main {
    public static void main(String[] args) {

        for (int i = 0; i <50 ; i++) {
            System.out.println(Operation.sum());
        }


        // writing data to files
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\caema\\IdeaProjects\\gazprombank\\new.txt");
            myWriter.write("Hello");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
