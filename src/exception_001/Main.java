package exception_001;

class Main {
    static public void main(String[] args) {
        System.out.println("Before");
        try {
            int a, b = 0;

            if (b == 0)
                throw new Exception("div by zero");
            else
                a = 2 / b;
        } catch (ArithmeticException ex1) {
            System.out.println(ex1);
            // System.exit(0);  // Из-за этого не доберёмся до блока finally
        } catch (Exception ex) {
            System.out.println("На ноль делить нельзя!");
            System.out.println(ex.getLocalizedMessage());
        } finally {
            System.out.println("AnyWay");
        }

        System.out.println("After");

    }
}
