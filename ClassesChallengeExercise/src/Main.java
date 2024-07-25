public class Main {

    public static void main(String[] args) {

        BankAccount giovannisaccount = new BankAccount();
        giovannisaccount.setNumber("12345");
        giovannisaccount.setBalance(100);
        giovannisaccount.setCustomerName("Robert Giovanni");
        giovannisaccount.setEmail("duicagiovany@yahoo.com");
        giovannisaccount.setPhoneNumber("40773344323");
        System.out.println("Customer name: " + giovannisaccount.getCustomerName());
        System.out.println("Customer email: " + giovannisaccount.getEmail());
        System.out.println("Customer phone number: " + giovannisaccount.getPhoneNumber());
        System.out.println("Customer balance: " + giovannisaccount.getBalance());

        giovannisaccount.withdraw(-100);
        System.out.println(giovannisaccount.getBalance());

    }
}
