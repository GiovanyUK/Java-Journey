
public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this("56789", 2.50, "Default name",
                "Default email", "Default phone");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email,
                       String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this ("99999", 100.55, customerName,
                customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Unable to deposit negative amount");
        } else {
            balance += amount;
            System.out.println("Your new balance is: " + balance); }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Unable to withdraw negative amount");
        }
        else if (amount > balance) {
            System.out.println("Not enough balance. You only have "
                    + balance + " and you want to withdraw " + amount
                    + " try to withdraw at least as much as you have!");
        } else {
            balance -= amount;
            System.out.println("Your new balance is: " + balance);
        }
    }
}
