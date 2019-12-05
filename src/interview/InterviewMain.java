package interview;


import java.util.Arrays;

public class InterviewMain {
    public static void main(String[] args) {
        String strData = "17.09.1986";
        String str1[] = strData.split("\\.");

        for (String st : str1) {
            System.out.print(st + " ");
        }

        System.out.println(Arrays.toString(str1));




    }
}
