public class Main {
    public static void main(String[] args) {
        Customer John = new Customer("John Smith", 120, "johndog@gmail.com");
        Customer Dragos = new Customer();
        Customer Manu = new Customer("Roland Manu", "rollmanu@gmail.com");
        System.out.println(John.getCreditLimit());
        System.out.println(John.getName());
        System.out.println(John.getEmailAddress());
        System.out.println(Dragos.getCreditLimit());
        System.out.println(Dragos.getName());
        System.out.println(Dragos.getEmailAddress());
        System.out.println(Manu.getCreditLimit());
        System.out.println(Manu.getName());
        System.out.println(Manu.getEmailAddress());
    }
}
