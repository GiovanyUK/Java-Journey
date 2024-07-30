public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting engine");
    }
    public void drive() {
        System.out.println("Driving. Car type is " + getClass().getSimpleName() );
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Running engine");
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = (cylinders != 4 && cylinders != 6 && cylinders != 8) ?
                cylinders : -1;
    }
    @Override
    public void startEngine() {
        System.out.println("Consuming gas to turn on");
    }

    @Override
    public void drive() {
        System.out.println("Making car noises while on the road idk");
    }

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = (batterySize > 0 && batterySize <= 100) ?
                batterySize : -1;
    }
    @Override
    public void startEngine() {
        System.out.println("Consuming electricity to turn on");
    }

    @Override
    public void drive() {
        System.out.println("Not making any sound while on the road");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre,
                     int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = (cylinders != 4 && cylinders != 6 && cylinders != 8) ?
        cylinders : -1;
        this.batterySize = (batterySize > 0 && batterySize <= 100) ?
                batterySize : -1;
    }

    @Override
    public void startEngine() {
        System.out.println("Doing hybrid car things while starting idk, not a car connoisseur");
    }

    @Override
    public void drive() {
        System.out.println("Making noticeable sound while on the road");
    }
}

