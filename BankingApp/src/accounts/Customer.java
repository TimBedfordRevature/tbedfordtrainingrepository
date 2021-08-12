package accounts;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String password;
    private int acc_number;
    private double balance;

    public Customer(){};

    public Customer(int id, String name, String email, String password, int acc_number, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.acc_number = acc_number;
        this.balance = balance;
    }

    public Customer(int id, String name, String email, String password, int acc_number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.acc_number = acc_number;
    }

    public Customer(int id, String name, String email, int acc_number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.acc_number = acc_number;
    }

    public Customer(String name, String email, String password, int acc_number, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.acc_number = acc_number;
        this.balance = balance;
    }
    public Customer(int id, String name, String email, int acc_number, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.acc_number = acc_number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ("\n"+"ID = " + id + ", Name = "  + name + ", Email = " + email + ", Account number = " + acc_number + ", Balance = " + balance+"\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(int acc_number) {
        this.acc_number = acc_number;
    }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }
}
