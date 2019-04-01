package exception_002;

class Main {
    static public void main(String[] args) {
        Exception exception = new Exception();

        try
        {
            throw exception;
        } catch (ArithmeticException ex)
        {
            System.out.println(ex.getLocalizedMessage());

        } catch (Exception ex)
        {
            System.out.println("Обработка исключений : ");
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
