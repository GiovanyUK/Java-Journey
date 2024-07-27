import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee elon = new SalariedEmployee("Elon Musk",
                "09/05/1958", "03/10/2026", 35000);
        System.out.println(elon);
        System.out.println("Elon's Pension check = $" + elon.collectPay());
        elon.retire();
        System.out.println(elon);

        HourlyEmployee jake = new HourlyEmployee("John Filler", "05/02/1946",
                "02/03/2024", 20);
        System.out.println(jake);
        System.out.println(jake.getHourlyPayRate());
        jake.getDoublePay();
        System.out.println(jake.getName() + " is " + jake.getAge());
        HourlyEmployee who = new HourlyEmployee();
        System.out.println(who);
        System.out.println("Elon's Pension check = $" + elon.collectPay());
    }
}
