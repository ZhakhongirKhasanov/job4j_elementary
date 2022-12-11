package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(210);
        System.out.println("140 ruble are " + euro + " euro");
        System.out.println("210 ruble are " + dollar + " dollar");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        in = 210;
        expected = 3.5f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("210 rubles are 3.5. Test result: " + passed);
    }

}
