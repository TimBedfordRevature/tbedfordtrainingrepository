package day3;

// exception handling
public class Demo10 {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(c);
    }
}
