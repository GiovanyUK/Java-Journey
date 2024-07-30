public class Main {
    public static void main(String[] args) {
        GasPoweredCar car1 = new GasPoweredCar("Chevrolet Spark 2022", 100, 4);
        ElectricCar car2 = new ElectricCar("Tesla Model 3", 547 , 100);
        HybridCar car3 = new HybridCar("Toyota Corolla", 100, 4, 100);

        car1.drive();
        car2.drive();
        car3.drive();
        car1.startEngine();
        car2.startEngine();
        car3.startEngine();



    }



}
