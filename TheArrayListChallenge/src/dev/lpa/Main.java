package dev.lpa;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printActions();
    }

    private static void printActions() {
        boolean isOn = true;
        ArrayList<String> groceries = new ArrayList<String>();

        while (isOn) {
            System.out.println("Enter number:" +
                    "\n0 to shutdown" +
                    "\n1 to add item(s) to list (comma delimited list)" +
                    "\n2 to remove any items (comma delimited list)");
            String answer = sc.nextLine();
            switch (answer) {
                case "0" -> {
                    if (groceries.isEmpty()) {
                        System.out.println("The List is empty");
                    } else {
                        System.out.println("The final groceries list is: " + groceries);
                    }
                    System.out.println("Shutting down the application...");
                    isOn = false;
                }
                case "1" -> {
                    System.out.println("Please enter what Item(s) you want to add to the list\n" +
                            "If multiple Items, delimit them with a comma ',' ");
                    addItems(groceries, sc.nextLine());
                }
                case "2" -> {
                    System.out.println("Please enter what Item(s) you want to remove from the list\n" +
                            "If multiple Items, delimit them with a comma ',' ");
                    removeItems(groceries, sc.nextLine());
                }
            }
        }
    }

    private static ArrayList<String> addItems(ArrayList<String> groceryList, String groceriesString) {
        String groceries = "";
        for (int i = 0; i < groceriesString.length(); i++) {
            if (groceriesString.charAt(i) != ',') {
                groceries += groceriesString.charAt(i);
            } else if (groceryList.isEmpty() || !groceryList.contains(groceries)) {
                groceryList.add(groceries);
                groceries = "";
            } else {
                groceries = "";
            }
        }
        if (!groceryList.contains(groceries)) {
            groceryList.add(groceries);
        }
        System.out.println(groceryList);
        groceryList.sort(Comparator.naturalOrder());
        return groceryList;
    }
    private static ArrayList<String> removeItems(ArrayList<String> groceryList, String groceriesString) {

        String groceries = "";
        for (int i = 0; i < groceriesString.length(); i++) {
            if (groceriesString.charAt(i) != ',') {
                groceries += groceriesString.charAt(i);
            } else if (groceryList.contains(groceries)) {
                groceryList.remove(groceries);
                groceries = "";
            } else {
                groceries = "";
            }
        }
        if (groceryList.contains(groceries)) {
            groceryList.remove(groceries);
        }
        System.out.println(groceryList);
        groceryList.sort(Comparator.naturalOrder());
        return groceryList;
    }
}
