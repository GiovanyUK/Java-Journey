public class DeluxeBurger extends Burger {
    private String type;
    private int price;
    private int grams;
    private String realToppings = "No topping";

    public DeluxeBurger() {
        this.type = "Deluxe";
        this.price = 50;
        this.grams = 600;
    }

    @Override
    public void addTopping(String topping) {
        if (toppings == 5) {
            System.out.println("No more than 5 toppings allowed!");
            return;
        }
        switch (topping) {
            case "meat", "cheese", "ketchup", "mustard", "sweetSauce" -> {
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
    public int getPrice() {
        return price;
    }


    public String getRealToppings() {
        return realToppings;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", grams=" + grams +
                ", realToppings='" + realToppings + '\'' +
                "} ";
    }
}
