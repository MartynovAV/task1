package task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task1Main {

    public static void main(String...args) {
        //getting list of offices:
        String officesFileName=args[0];
        List<Integer> list=Offices.getOfficeList(officesFileName);

        int quantityOfOperations=Integer.parseInt(args[1]);//Quantity of operations
        int numberOfOutFiles=args.length-2; //number Of OutPutFiles
        //Quantity of operations that will be written into each output file
        int [] quantityForEach=new int[numberOfOutFiles];
        int tempSum=0;
        for (int i = 0; i < numberOfOutFiles-1; i++) {
            quantityForEach[i]=quantityOfOperations/numberOfOutFiles;
            tempSum+=quantityForEach[i];
        }
        quantityForEach[numberOfOutFiles-1]=quantityOfOperations-tempSum;
        //
        String [] outFile=new String[numberOfOutFiles];
        String [] filePath=new String[numberOfOutFiles];
        int operationNumber=1;

        // Start and end time in millis
        long [] startEndTime=RandomDate.startEndTimeMillis();

        for (int i = 0; i <numberOfOutFiles; i++) {
            outFile[i] = args[2 + i];
            String separator= File.separator;
            filePath[i]="C:"+separator+"task1"+separator+outFile[i];
            try {
                FileWriter writer = new FileWriter(filePath[i]);
                for (int j = 0; j <quantityForEach[i]; j++) {
                    String operationInfo=RandomDate.randomDateTime(startEndTime)+"\t"+Offices.getOfficeNumber(list)+"\t"+
                            operationNumber + "\t"+Operation.sum()+"\n";
                    writer.write(operationInfo);
                    operationNumber++;
                }
                writer.close();
                System.out.println("Successfully wrote to the file "+outFile[i]+".");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
