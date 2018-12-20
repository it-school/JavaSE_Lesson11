package exception_004;

public class Main
{
    static public void main(String[] args)
    {
        try
        {
            throw new UserException();
        } catch (UserException ex)
        {
            System.out.println("Произошло исключение");
            ex.Method();
        } catch (Exception ex)
        {
            System.out.println("Произошло 111 исключение");

        }
    }
}
