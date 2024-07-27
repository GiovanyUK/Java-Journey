public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name , String birthDate,
                           String hireDate,
                          double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }



    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

   public double getDoublePay () {
        return 2 * hourlyPayRate;
    }

}
