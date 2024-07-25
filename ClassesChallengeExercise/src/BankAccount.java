
public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
