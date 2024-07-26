public class Main {

    public static void main(String[] args) {

//        BankAccount giovannisaccount = new BankAccount("12345", 1000, "Giovanni Robert",
//                "duicagiovany@yahoo.com", "+40773344323");
        BankAccount giovannisaccount = new BankAccount();
        System.out.println(giovannisaccount);
        System.out.println(giovannisaccount.getBalance());
        System.out.println(giovannisaccount.getNumber());
//        giovannisaccount.setNumber("12345");
//        giovannisaccount.setBalance(100);
//        giovannisaccount.setCustomerName("Robert Giovanni");
//        giovannisaccount.setEmail("duicagiovany@yahoo.com");
//        giovannisaccount.setCustomerPhone("40773344323");
//        System.out.println("Customer name: " + giovannisaccount.getCustomerName());
//        System.out.println("Customer email: " + giovannisaccount.getEmail());
//        System.out.println("Customer phone number: " + giovannisaccount.getCustomerPhone());
//        System.out.println("Customer balance: " + giovannisaccount.getBalance());

        giovannisaccount.withdraw(-100);
        System.out.println(giovannisaccount.getBalance());
        BankAccount dragosaccount = new BankAccount("Dragos", "dragoshy@gmail.com", "12345");
        System.out.println(dragosaccount.getNumber() + " " + dragosaccount.getCustomerName());
    }
}
