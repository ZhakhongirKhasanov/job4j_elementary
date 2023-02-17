package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y] < 0) {
                    array[x][y] = 0;
                }
            }
        }
        return array;
    }
}