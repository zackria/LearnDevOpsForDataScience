package com.packt.devops.datascience;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class DataSciencePrg01 {
    public static double x = 0;
    public static double y = 0;
    public static double z = 0;
    public static double a = 0;
    public static double b = 0;
    public static int intArray[] = { 5, 2, 5, 6, 1, 2, 6, 7, 2, 6, 3, 5, 5 };
    public static DescriptiveStatistics stats = null;

    /**
     * Main Method for DataSciencePrg01
     *
     * @param args
     */
    public static void main(String[] args) {
        // Integer array for the program

        DataSciencePrg01 dataScience = new DataSciencePrg01();
        dataScience.init();
        dataScience.mean();
        dataScience.median();
        dataScience.mode();
        dataScience.stdev();
        dataScience.variance();

    }

    public static void init() {
        // Get a SummaryStatistics instance
        stats = new DescriptiveStatistics();
        for (int i : intArray)
            stats.addValue(i);
    }

    /**
     *
     * Method used to calculate mean
     */
    public static void mean() {
        x = stats.getMean();
        System.out.println(x);
    }

    /**
     *
     * Method used to calculate median
     */
    public static void median() {
        y = stats.getPercentile(50);
        System.out.println(y);

    }

    /**
     *
     * Method used to calculate mode
     */
    public static void mode() {

        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < intArray.length; ++i) {
            int count = 0;
            for (int j = 0; j < intArray.length; ++j) {
                if (intArray[j] == intArray[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = intArray[i];
            }
        }

        z = maxValue;
        System.out.println(z);

    }

    /**
     *
     * Method used to calculate stdev
     */
    public static void stdev() {
        a = stats.getStandardDeviation();
        System.out.println(a);

    }

    /**
     *
     * Method used to calculate stdev
     */
    public static void variance() {
        b = stats.getVariance();
        System.out.println(b);
    }

}
