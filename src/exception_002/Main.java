package exception_002;

class Main {
    static public void main(String[] args) {
        Exception exception = new Exception("Моё исключение");

        try {
            throw exception;
        } catch (Exception ex) {
            System.out.println("Обработка исключений : ");
            System.out.println(ex);
        }
    }
}
