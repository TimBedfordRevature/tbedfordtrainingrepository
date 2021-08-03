package day6;

interface MultipleStatement {
    String print(String message);
}

interface MultipleNumbers {
    Integer print(int number);
}

public class Demo8 {
    public static void main(String[] args) {
        MultipleStatement multipleStatement = (message) -> {
            String str1 = "Statement 1, ";
            String str2 = "Statement 2, ";
            String str3 = "Statement 3";
            return str1 + str2 + str3;
        };

        System.out.println(multipleStatement.print("Hello"));

        MultipleNumbers multipleNumbers = (number) -> {
            int a = 2;
            int b = 3;
            int c = 5;
            return a + b + c;
        };

        System.out.println(multipleNumbers.print(1));
    }
}