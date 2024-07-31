public class Burger {
    private String type;
    private int size;
    private int price;
    private int grams;
    private String realToppings = "No topping";
    private int basePrice;
    public Burger()  {
    }

    public Burger(int basePrice, String realToppings, int grams, int price, int size, String type) {
        this.basePrice = basePrice;
        this.realToppings = realToppings;
        this.grams = grams;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    public Burger(int type, int size) {
        switch (type) {
            case 1 -> this.type = "Bob Burger";
            case 2 -> this.type = "Hamburger - Chicken";
            case 3 -> this.type = "Hamburger - Pork";
            case 4 -> this.type = "Cheeseburger - Chicken";
            case 5 -> this.type = "Cheeseburger - Pork";
            default -> this.type = "Invalid type";
        }
        switch (size) {
            case 1 -> {
                this.type += " (S)";
                this.size = size;
                this.price = 20;
                this.basePrice = 20;
                this.grams = 300;
            }
            case 2 -> {
                this.type += " (M)";
                this.size = size;
                this.price = 25;
                this.basePrice = 25;
                this.grams = 400;
            }
            case 3 -> {
                this.type += " (L)";
                this.size = size;
                this.price = 30;
                this.basePrice = 30;
                this.grams = 500;
            }
            default -> this.size = -1;
        }
    }

    public int getPrice() {
        return price;
    }

    static int toppings = 0;

    public void addTopping(String topping) {
        if (toppings == 3) {
            System.out.println("No more than 3 toppings allowed!");
            return;
        }
        switch (topping) {
            case "meat", "cheese" -> {
                this.price += 6;
                this.grams = grams + 50;
                this.realToppings += " + " + topping;
                toppings++;
                if (toppings == 1) {
                    this.realToppings = topping;
                }
            }
            case "ketchup", "mustard", "sweetSauce" -> {
                this.price += 3;
                this.grams = grams + 50;
                this.realToppings += " + " + topping;
                toppings++;
                if (toppings == 1) {
                    this.realToppings = topping;
                }
            }
            default -> System.out.println("Invalid topping, try again");
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", grams=" + grams +
                ", realToppings='" + realToppings + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getType() {
        return type;
    }

    public String getRealToppings() {
        return realToppings;
    }
}