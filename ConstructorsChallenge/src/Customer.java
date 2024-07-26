public class Customer {

    private String name;

    private Integer creditLimit;

    private String emailAddress;


    public Customer(String name, Integer creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer() {
        this("Unknown", 100, "johndoe@gmail.com");
    }
    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public String getName() {
        return name;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
