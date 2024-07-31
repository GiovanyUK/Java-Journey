public class SideItem {
    private int price;
    private String type;
    private int grams;

    public SideItem(int type) {
        switch (type) {
            case 1 -> {
                this.type = "Fries";
                this.grams = 100;
                this.price = 10;
            }
            case 2 -> {
                this.type = "Nuggets";
                this.grams = 100;
                this.price = 10;
            }
            default -> this.type = "Invalid type";
        }
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "price=" + price +
                '}';
    }
}