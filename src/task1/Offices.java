package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Offices {

    public static List <Integer> getOfficeList(){
            List <Integer> officeList=new ArrayList<>();
            //add delimeter to file path
            String officesFileName="offices.txt";
            String officesFilePath="C:\\Users\\caema\\IdeaProjects\\gazprombank\\"+officesFileName;
            File file = new File(officesFilePath);

            Scanner sc = null;
            try {
                sc = new Scanner(file);
                sc.useDelimiter(" ");

                while (sc.hasNext()){
                        officeList.add(sc.nextInt());
                }

            } catch (FileNotFoundException e) {
                System.out.println("Offices file has not found");
                e.printStackTrace();
            }
            return officeList;
        }

        public static int getOfficeNumber(){
            List <Integer> list=getOfficeList();
            int quantity=list.size();
            //Random index
            int index= (int)(Math.random()*quantity);
            //Random office number
            return  list.get(index);
        }
}
