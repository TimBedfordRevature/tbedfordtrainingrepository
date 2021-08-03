package day6;

interface Hello {
    public String greeting();
}

interface Welcome{
    public String greeting(String name);
}

interface Calculator1 {
    public int addNum(int a, int b);
}

public class Demo7 {
    public static void main(String[] args) {

        Hello hello = () -> {
            return "Hello World!";
        };
        System.out.println(hello.greeting());

//////////////////////////////////////////////////////////////////

        Welcome welcome = (name) -> {
            return "Welcome " + name;
        };
        System.out.println(welcome.greeting("Tim"));

//////////////////////////////////////////////////////////////////

        Calculator1 calculator = (a, b) -> {
            return a + b;
        };
        System.out.println(calculator.addNum(10, 40));
    }
}
