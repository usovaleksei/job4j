package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int inRE = 140;
        int expectedRE = 2;
        int outRE = rubleToEuro(inRE);
        boolean passedRE = expectedRE == outRE;
        System.out.println("140 rubles are 2 euro. Test result: " + passedRE);
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        int inRD = 200;
        int expectedRD = 3;
        int outRD = rubleToDollar(inRD);
        boolean passedRD = expectedRD == outRD;
        System.out.println("200 rubles are 3 dollars. Test result: " + passedRD);
        int dollar = rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollars");
        int inER = 10;
        int expectedER = 700;
        int outER = euroToRuble(inER);
        boolean passedER = expectedER == outER;
        System.out.println("10 euro are 700 rubles. Test result: " + passedER);
        int eurorub = euroToRuble(10);
        System.out.println("10 euro are " + eurorub + " rubles");
        int inDR = 15;
        int expectedDR = 900;
        int outDR = dollarToRuble(inDR);
        boolean passedDR = expectedDR == outDR;
        System.out.println("15 dollars are 900 rubles. Test result: " + passedDR);
        int dollarrub = dollarToRuble(15);
        System.out.println("15 dollars are " + dollarrub + " rubles");
    }
}
