package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            int x = word.length - post.length;
            if (post[index] != word[index + x]) {
                return false;
            }
        }
        return true;
    }
}
