package lesson_03;

public class Converter {

    public static final double COURSE_DOLLAR = 95.5;
    public static final double COURSE_EURO = 101.8;

    static void main() {
        int value = 5;
        double result1 = convertRubleToDollar(value);
        double result2 = convertRubleToEuro(value);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static double convertRubleToDollar(double value) {
        return value * COURSE_DOLLAR;
    }

    public static double convertRubleToEuro(double value) {
        return value * COURSE_EURO;
    }
}
