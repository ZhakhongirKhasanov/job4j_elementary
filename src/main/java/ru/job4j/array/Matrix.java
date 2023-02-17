package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int x = 0; x < size; x++) {
                table[i][x] = (i + 1) * (x + 1);
            }
        }
        return table;
    }
}
