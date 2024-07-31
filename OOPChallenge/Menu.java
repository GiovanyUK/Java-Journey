import java.util.Scanner;

public class Menu {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private int price;

    public Menu() {
        this.burger = new Burger(1, 2);
        this.drink = new Drink(1, 2);
        this.sideItem = new SideItem(1);
        this.price = this.burger.getPrice() + this.drink.getPrice() + this.sideItem.getPrice();
    }

    public Menu(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.price = this.burger.getPrice() + this.drink.getPrice() + sideItem.getPrice();
    }

    public void updateMenuPrice() {
        if (burger instanceof DeluxeBurger) {
            this.price = (burger.getPrice() - burger.getBasePrice());
        }
        else {
            this.price = 35 + (burger.getPrice() - burger.getBasePrice());
        }// Adjust price based on topping cost
    }

    public Burger getBurger() {
        return burger;
    }


    @Override
    public String toString() {
        updateMenuPrice(); // Ensure the price is updated before displaying
        return "Menu{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                ", price=" + price + '\'';
    }

    public int getPrice() {
        return price;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void printReceipt() {
        if (burger instanceof DeluxeBurger) {
            System.out.println("=".repeat(46) + "\nReceipt\n" +
                    "-----\nDeluxe Burger" + "(" + burger.getRealToppings() +
                    "): RON " + burger.getPrice() +
                    "\n" +
                    drink.getType() + ": RON 0" +
                    "\n" + sideItem.getType() + ": RON 0" +
                    "\n\nTotal: RON 50" +
                    "\n" + "=".repeat(46) );
        }
        else {
            System.out.println("=".repeat(46) + "\nReceipt\n" +
                    "-----\n" +
                    burger.getType() + "(" + burger.getRealToppings()+ "): RON " + burger.getPrice() +
                    "\n" +
                    drink.getType() + ": RON " + drink.getPrice() +
                    "\n" + sideItem.getType() + ": RON " + sideItem.getPrice() +
                    "\n\nTotal: RON " + getPrice() +
                    "\n" + "=".repeat(46) );
        }
    }
}