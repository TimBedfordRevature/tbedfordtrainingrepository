package assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Please select a calculator: \n1. EMI calculator" +
                    "\n2. basic operations calculator\n3. quit");
            int selection = scanner.nextInt();

            if (selection == 1) {
                EMI();
            } else if (selection == 2) {
                calculator();
            } else if (selection == 3){
                running = false;
            }else {

            }
        }
        scanner.close();

    }

    static int addNum(int x, int y) {
        return (x + y);
    }

    static int subNum(int x, int y) {
        return (x - y);
    }

    static int divNum(int x, int y) {
        return (x / y);
    }

    static int multNum(int x, int y) {
        return (x * y);
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation (input number EX: 1 for add):\n1. add\n2. subtract\n3. divide\n4. multiply");
        int operator = scanner.nextInt();

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter second number: ");
        int y = scanner.nextInt();

        switch (operator) {
            case 1: {
                System.out.println("result: " + addNum(x, y));
            }
            break;
            case 2: {
                System.out.println("result: " + subNum(x, y));
            }
            break;
            case 3: {
                System.out.println("result: " + divNum(x, y));
            }
            break;
            case 4: {
                System.out.println("result: " + multNum(x, y));
            }
        }

    }

    // EMI = [P x R x (1+R)^N]/[(1+R)^N-1]
    public static void EMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter loan amount (Principle): ");
        double P = scanner.nextDouble();
        System.out.println("Enter interest rate: ");
        double R = scanner.nextDouble();
        System.out.println("Enter number of monthly instalments: ");
        int N = scanner.nextInt();

        double emi = ((P * R * Math.pow((1 + R), N)) / (Math.pow((1 + R), N - 1)));

        System.out.println("EMI: $" + emi);
    }
}
