package dev.felipe;


public class Day {

    private int[] daysList = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public int numberOfDays(int month) {
        if (month < 1 || month > 12) {
            return 0;
        } else {
            return daysList[month - 1];
        }
    }

}