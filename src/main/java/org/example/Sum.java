package org.example;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        for (String arg : args) {
            if (isNumeric(arg)) {
                sum += Double.parseDouble(arg);
            } else {
                System.out.println("Некорректное значение: " + arg + " заменено на 0.");
            }
        }
        System.out.println(sum);
    }

    //  -? значит '-' может появляться 0 или 1 раз
    //  \\d+ значит любоая цифра от 0 до 9 может появляться один или более раз
    //  (\\.\\d+)? значит блок в скобках (точка и любоая цифра от 0 до 9 может появляться один или более раз) может появляться 0 или 1 раз
    private static boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }

}
