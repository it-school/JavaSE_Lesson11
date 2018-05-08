package exception_001;

class Main {
    static public void main(String[] args) {
        try {
            int a = 2 / 0;
        } catch (ArithmeticException ex1) {
            System.out.println(ex1);
            System.exit(0);  // Из-за этого не доберёмся до блока finally

        } catch (Exception ex) {
            System.out.println("На ноль делить нельзя!");
            System.out.println(ex);
        }
        finally {
            System.out.println("AnyWay");
        }

    }
}
