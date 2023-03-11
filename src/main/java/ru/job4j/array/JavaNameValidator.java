package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
        if (rsl) {
            for (int x = 1; x < name.length(); x++) {
                int code = name.codePointAt(x);
                if (!Character.isDigit(code) && !isSpecialSymbol(code)
                        && !isUpperLatinLetter(code) && !isLowerLatinLetter(code)) {
                    return false;
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}