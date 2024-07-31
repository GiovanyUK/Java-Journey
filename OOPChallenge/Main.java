import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Menu newerMenu = new Menu();                      //Test
//        newerMenu.printReceipt();
        makeOrder();
    }

    public static void makeOrder() {
        Scanner s = new Scanner(System.in);
        System.out.println("""
                Do you want the deluxe burger menu?
                1 for yes
                2 for no""");
        String deluxe = s.nextLine();
        if (deluxe.equals("2")) {
            System.out.println("""
                    Enter:
                    1 for Bob Burger
                    2 for Hamburger - Chicken
                    3 for Hamburger - Pork
                    4 for Cheeseburger - Chicken
                    5 for Cheeseburger - Pork""");
            String burgerType = s.nextLine();
            System.out.println("""
                    Enter burger size:
                    1 for small
                    2 for medium
                    3 for big""");
            String burgerSize = s.nextLine();
            Burger burger = new Burger(Integer.parseInt(burgerType), (Integer.parseInt(burgerSize)));
            int times = 0;
            while (true) {
                System.out.println("""
                        Do you want any extra toppings? 
                        Type: 
                        1 for yes
                        2 for no""");
                String answer1 = s.nextLine();
                if (Objects.equals(answer1, "1")) {
                    if (times == 3) {
                        System.out.println("Maximum number of toppings is 3");
                        break;
                    }
                    System.out.println("""
                            What topping do you want: 
                            1 for meat 
                            2 for cheese
                            3 for ketchup
                            4 for mustard
                            5 for sweetSauce?""");
                    String topping = s.nextLine();
                    if (Objects.equals(topping, "1")) {
                        topping = "meat";
                    }
                    else if (Objects.equals(topping, "2")) {
                        topping = "cheese";
                    }
                    else if (Objects.equals(topping, "3")) {
                        topping = "ketchup";
                    }
                    else if (Objects.equals(topping, "4")) {
                        topping = "mustard";
                    }
                    else if (Objects.equals(topping, "5")) {
                        topping = "sweetSauce";
                    }
                    burger.addTopping(topping);
                } else if (Objects.equals(answer1, "2")) {
                    break;
                }
                times++;
            }
            System.out.println("""
                    Choose a drink: 
                    1 for Fanta
                    2 for Pepsi
                    3 for Lipton
                    4 for Prigat""");
            String answer2 = s.nextLine();
            System.out.println("""
                    Choose size of the drink:
                    "1 for small
                    "2 for medium
                    "n3 for big""");
            String answer22 = s.nextLine();
            Drink drink = new Drink(Integer.parseInt(answer2), Integer.parseInt(answer22));

            System.out.println("""
                    Choose a side food:
                    1 for Fries
                    2 for Nuggets""");
            String answer3 = s.nextLine();
            SideItem sideItem = new SideItem(Integer.parseInt(answer3));

            Menu newMenu = new Menu(burger, drink, sideItem);
            System.out.println("Total overdue is: " + newMenu.getPrice() + "\nPrice of the burger: " + newMenu.getBurger().getPrice() +
                    "\nPrice of the drink: " + newMenu.getDrink().getPrice() + "\nPrice of the sideItem: " + newMenu.getSideItem().getPrice() + "\n");

            System.out.println(burger);
            System.out.println(drink);
            System.out.println(sideItem);
            newMenu.printReceipt();
        }
        else {
            Burger burger = new DeluxeBurger();
            int times = 0;
            while (true) {
                System.out.println("""
                        Do you want any extra toppings? 
                        Type: 
                        1 for yes
                        2 for no""");
                String answer1 = s.nextLine();
                if (Objects.equals(answer1, "1")) {
                    if (times == 5) {
                        System.out.println("Maximum number of toppings is 5");
                        break;
                    }
                    System.out.println("""
                            What topping do you want: 
                            1 for meat 
                            2 for cheese
                            3 for ketchup
                            4 for mustard
                            5 for sweetSauce?""");
                    String topping = s.nextLine();
                    if (Objects.equals(topping, "1")) {
                        topping = "meat";
                    }
                    else if (Objects.equals(topping, "2")) {
                        topping = "cheese";
                    }
                    else if (Objects.equals(topping, "3")) {
                        topping = "ketchup";
                    }
                    else if (Objects.equals(topping, "4")) {
                        topping = "mustard";
                    }
                    else if (Objects.equals(topping, "5")) {
                        topping = "sweetSauce";
                    }
                    burger.addTopping(topping);
                } else if (Objects.equals(answer1, "2")) {
                    break;
                }
                times++;
            }
            System.out.println("""
                    Choose a drink: 
                    1 for Fanta
                    2 for Pepsi
                    3 for Lipton
                    4 for Prigat""");
            String answer2 = s.nextLine();
            System.out.println("""
                    Choose size of the drink:
                    1 for small
                    2 for medium
                    3 for big""");
            String answer22 = s.nextLine();
            Drink drink = new Drink(Integer.parseInt(answer2), Integer.parseInt(answer22));

            System.out.println("""
                    Choose a side food:
                    1 for Fries
                    2 for Nuggets""");
            String answer3 = s.nextLine();
            SideItem sideItem = new SideItem(Integer.parseInt(answer3));
            Menu newMenu = new Menu(burger, drink, sideItem);
            System.out.println("Total overdue is: " + newMenu.getBurger().getPrice() + "\n");
            System.out.println(newMenu);
            System.out.println(burger);
            System.out.println(drink);
            System.out.println(sideItem);
            newMenu.printReceipt();
        }
    }
}

