public class Drink {
    private int size;
    private int price;
    private String type;
    private double liters;

    public Drink(int type, int size) {
        switch (type) {
            case 1 -> this.type = "Fanta";
            case 2 -> this.type = "Pepsi";
            case 3 -> this.type = "Lipton";
            case 4 -> this.type = "Prigat";
            default -> this.type = "Invalid type";
        }
        switch (size) {
            case 1 -> {
                this.type += " (S)";
                this.size = size;
                this.price = 7;
                this.liters = 0.5;
            }
            case 2 -> {
                this.size = size;
                this.type += " (M)";
                this.price = 10;
                this.liters = 1;
            }
            case 3 -> {
                this.size = size;
                this.type += " (L)";
                this.price = 13;
                this.liters = 2;
            }
            default -> this.size = -1;
        }
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}