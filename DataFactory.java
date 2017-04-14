import java.util.ArrayList;
import java.util.Scanner;

public class DataFactory {
    public static void main(String[] args) {
        //instantiate the data set in an array list
        ArrayList<Double> dataSet = new ArrayList<Double>();
        //call method to gather data
        dataSet = getData();
        //call method to get total
        double total = getTotal(dataSet);
        //call method to get average of the set
        double average = getAverage(dataSet, total);
        //call method to find minimum value of the set;
        double minimum = getMinimum(dataSet);
        // call method to find the maximum value of the set;
        double maximum = getMaximum(dataSet);
        double range = maximum - minimum;
        // report data to user
        System.out.println("=====Set values=====");
        for (int i = 0; i < dataSet.size(); i++) {
            System.out.println("" + dataSet.get(i));
        }
        System.out.println("==========");
        System.out.println("Total: " + total);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Average: " + average);
        System.out.println("Range: " + range);
    }

    /**
     * @method getData();
     * @returns dataSet, arrayList of all numbers
     * */
    static ArrayList<Double> getData() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> dataSet = new ArrayList<Double>();
        System.out.println("Enter the next number in the set or enter a non-numerical value to exit: ");
        dataSet.add(scan.nextDouble());
        String loopString = "Y";
        while(scan.hasNextDouble()) {
            dataSet.add(scan.nextDouble());
        }
        return dataSet;
    }

    static double getTotal(ArrayList<Double> dataSet) {
        double total = 0;
        for (int i = 0; i < dataSet.size(); i++) {
            total += dataSet.get(i);
        }
        return total;

    }

    static double getAverage(ArrayList<Double> dataSet, double total) {
        return (total/dataSet.size());
    }

    static double getMinimum(ArrayList<Double> dataSet) {
        double minimum = dataSet.get(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if (dataSet.get(i) < minimum)
                minimum = dataSet.get(i);
        }
        return minimum;
    }

    static double getMaximum(ArrayList<Double> dataSet) {
        double maximum = dataSet.get(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if (dataSet.get(i) > maximum)
                maximum = dataSet.get(i);
        }
        return maximum;
    }
}
