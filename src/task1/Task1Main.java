package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task1Main {

    public static void main(String...args) {
        String officesFileName=args[0];
        List<Integer> list=Offices.getOfficeList(officesFileName);

        int quantityOfOperations=Integer.parseInt(args[1]);
        //number Of OutPutFiles:
        int numberOfOutFiles=args.length-2;
        //Quantity of operations that will be written into each output file
        int [] quantityForEach=new int[numberOfOutFiles];

        int tempsum=0;
        for (int i = 0; i < numberOfOutFiles-1; i++) {
            quantityForEach[i]=quantityOfOperations/numberOfOutFiles;
            tempsum+=quantityForEach[i];
        }
        quantityForEach[numberOfOutFiles-1]=quantityOfOperations-tempsum;

        String [] outFile=new String[numberOfOutFiles];
        String [] filePath=new String[numberOfOutFiles];
        int operationNumber=1;

        for (int i = 0; i <numberOfOutFiles; i++) {
            outFile[i] = args[2 + i];
            filePath[i]="C:\\Users\\caema\\IdeaProjects\\gazprombank\\"+outFile[i];
            try {
                FileWriter myWriter = new FileWriter(filePath[i]);
                String heading="Date"+"\t"+"time"+"\t"+"OfficeNumber"+"\t"+"OperationNumber"+"\t"+"OperationSum"+"\n";
                myWriter.write(heading);
                for (int j = 0; j <quantityForEach[i]; j++) {
                    String operationInfo=RandomDate.randomDateTime()+"\t"+Offices.getOfficeNumber(list)+"\t"+
                            operationNumber + "\t"+Operation.sum()+"\n";
                    myWriter.write(operationInfo);
                    operationNumber++;
                }
                myWriter.close();
                System.out.println("Successfully wrote to the file "+outFile[i]+".");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
