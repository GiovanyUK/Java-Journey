public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog (String type, double weight) {
        this (type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large") , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    public Dog() {
        super("Mutt", "Big", 50);
    }

    private void bark() {
        System.out.print("Woof! ");
    }
    public void run() {
        System.out.print("Dog running");
    }
    public void walk() {
        System.out.println("Dog walking");
    }
    public void wagTail() {
        System.out.println("Tail wagging");
    }

    public void makeNoise() {

        if (type == "Wolf") {
            System.out.println("Ow Wooooooo! ");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
    if (speed == "slow") {
        walk();
        wagTail();
    } else {
        run();
        bark();
    }
        System.out.println();
    }
}
