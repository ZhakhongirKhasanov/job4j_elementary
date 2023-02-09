package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[index + word.length - post.length]) {
                return false;
            }
        }
        return true;
    }
}
