package day3;

class EmployeeException extends Throwable {

}

public class Demo11 {
    public static void main(String[] args) throws EmployeeException {
       // throw new ArithmeticException();
        throw new EmployeeException();
    }
}
