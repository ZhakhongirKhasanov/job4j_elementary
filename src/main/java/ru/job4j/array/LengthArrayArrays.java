package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {5, 32}, {34, 67, 43}, {99, 34, 13, 14}};
        for (int index = 0; index < array.length; index++) {
            System.out.println("Размер вложенного массива равен: " + array[index].length);
        }
    }
}
