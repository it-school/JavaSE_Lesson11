package exception_005;

class Main {
    public static void main(String[] args) {
        try {
            int a = 2 / 1;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Я выполнюсь в любом случае!");
        }
    }
}
