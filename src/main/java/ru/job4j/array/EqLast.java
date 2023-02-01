package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int x = 0; x < left.length - 1; x++) {
            for (int y = 0; y < right.length - 1; y++) {
                if (left[left.length - 1] == right[right.length - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
