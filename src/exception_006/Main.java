package exception_006;

import java.util.Scanner;

public class Main {
    public static Integer info(String arg) {
        int a = -1;

        try {
            a = Integer.valueOf(arg);
        } catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            return a;
        }
    }

    public static void main(String[] args) {
        String number = "12,3";
        float fnumber = 0;
        boolean result = false;
        System.out.println(info(number));

        Scanner scanner = new Scanner(System.in);

        while (result == false) {
            System.out.println("Input float value:\n");
            number = scanner.next();
            try {
                fnumber = Float.valueOf(number);
                result = true;
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage() + "\nTry to input again:\n");
            }
        }
        scanner.close();
        System.out.println(fnumber);

        // Программа запрашивает с клавиатуры значение числителя и знаменателя обыкновенной дроби,
        // для каждого из них производитс попытка преобразования в целые числа с обработкой исключений.
        // Затем производится попытку вычисления частного от деления (так же с обработкой исключений).
        // В случае арифметической ошибки просит повторно ввести числитель и знаменатель.
        // После успешного завершения преобразований и вычисления выводитс результат на экран.
    }
}
