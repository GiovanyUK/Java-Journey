public class Worker {
    private String name;
    protected String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Worker () {
        this.name = "unknown";
        this.birthDate = "unknown";
        this.endDate = "unknown";
    }
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }



    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }
    public double collectPay() {
        return 0.0;
    }
    public void terminate(String endDate) {
        endDate = "today";
        System.out.println(name + " has terminated " + endDate);
    }
}
