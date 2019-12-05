package task1;

public class Operation {
    public static double sum() {
        double min=10000.12;
        double max=100000.50;
        double sum=Math.random()*(max-min)+min;
        return Math.round(sum * 100.0) / 100.0;
    }
}
