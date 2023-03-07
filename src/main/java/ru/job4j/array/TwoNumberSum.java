package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int x = 0;
        int i = array.length - 1;
        while (x < i) {
            if (array[x] + array[i] == target) {
                return new int[]{x, i};
            } else if (array[x] + array[i] < target) {
                x++;
            } else {
                i--;
            }
        }
        return new int[] {};
    }
}