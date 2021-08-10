package accounts;

public class Employee  {
    private int emp_id;
    private String name;
    private String password;
    private int emp_number;

    public Employee(int emp_id, String name, String password, int emp_number) {
        this.emp_id = emp_id;
        this.name = name;
        this.password = password;
        this.emp_number = emp_number;
    }

    public Employee(){}

    @Override
    public String toString() {
        return ("\n"+"ID = " + emp_id + ", Name = "  + name + ", Employee number = " + emp_number);
    }

    public int getId() {
        return emp_id;
    }

    public void setId(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(int emp_number) {
        this.emp_number = emp_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
