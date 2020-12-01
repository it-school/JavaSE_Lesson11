package exception_002;

class Main {
    static public void main(String[] args) {
        try {
            int a = 2;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("1" + ex.getLocalizedMessage());

        } catch (Exception ex) {
            System.out.println("Обработка исключений : ");
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
