package exception_003;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Мое Исключение");
        } catch (Exception ex) {
            System.out.println("Обработка исключений : ");
            System.out.println(ex);
        }
    }
}
