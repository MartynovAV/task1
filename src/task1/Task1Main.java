package task1;

//https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
//Date time OfficeNumber OperationNumber OperationSum

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Task1Main {
    public static void main(String...args) {

        String officesFileName=args[0];
        int quantityOfOperations=Integer.parseInt(args[1]);

        int numberOfOutFiles=args.length-2;
        int [] quantityForEach=new int[numberOfOutFiles];

        for (int i = 0; i < numberOfOutFiles-1; i++) {
            quantityForEach[i]=quantityOfOperations/numberOfOutFiles;
        }


        String [] outputFile=new String[numberOfOutFiles];
        String [] filePath=new String[numberOfOutFiles];

        for (int i = 0; i <numberOfOutFiles; i++) {
            outputFile[i] = args[2 + i];
            filePath[i]="C:\\Users\\caema\\IdeaProjects\\gazprombank\\new.txt"+outputFile[i];
            try {
                FileWriter myWriter = new FileWriter(filePath[i]);
                myWriter.write("Hello");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
