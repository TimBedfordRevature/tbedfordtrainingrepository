package day7;

class Employee{

    String name;

    public <T> Employee(T name){
        this.name = name.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tim");
        Employee emp2 = new Employee(445);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
