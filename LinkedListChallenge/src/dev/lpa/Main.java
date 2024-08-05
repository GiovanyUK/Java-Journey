package dev.lpa;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Town> placesToVisit = new LinkedList<>();
        addCities(placesToVisit, new Town("Tokyo", 0));
        addCities(placesToVisit, new Town("Kobe", 424));
        addCities(placesToVisit, new Town("Kyoto", 364));
        addCities(placesToVisit, new Town("Nara", 370));
        addCities(placesToVisit, new Town("Osaka", 396));
        addCities(placesToVisit, new Town("Yokohama", 27));
        var iterator = placesToVisit.listIterator();
        boolean quitLoop = false;
        boolean forward = false;
        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Originating : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter value: ");
            int menuItem = sc.nextInt();
            switch(menuItem){
                case 1:
                    System.out.println("User wants to go forward");
                    if(!forward) {
                        forward = true;
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 2:
                    System.out.println("User wants to go backward");
                    if(forward) {
                        forward = false;
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case 3:
                    printItinerary(placesToVisit);
                    break;
                case 4:
                    printMenu();
                    break;

                case 5:
                    break;
            }


        }


    }
    private static void printMenu() {
        System.out.println("Available actions\n1 - Forward\n2 - Backward\n3 - List places\n4 - Menu\n5 - Quit");
    }
    private static void addCities(LinkedList<Town> list, Town town) {
        list.sort((o1, o2) -> Integer.compare(o1.getDistance(), o2.getDistance()));

        if(list.contains(town)) {
            System.out.println("Found duplicate: " + town);
            return;
        }

        for (Town t : list) {
            if (t.getName().equalsIgnoreCase(town.getName())) {
                System.out.println("Found duplicate: " + town);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace: list) {
            if(town.getDistance() < listPlace.getDistance()) {
                list.add(matchedIndex, town);
                return;
            }
            matchedIndex++;
        }
        list.add(town);
    }

    public static void printItinerary(LinkedList<Town> list) {
        ListIterator<Town> iterator = list.listIterator( 0);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println(town.getName());
        }
    }

    public static void printItinerary3(LinkedList<Town> list, int number) {
        System.out.println("Trip starts at " + list.getFirst().getName());
        String previousTown = list.getFirst().getName();
        int previousDistance = list.getFirst().getDistance();
        ListIterator<Town> iterator = list.listIterator(number - 1);
        int times = 0;
        while (times == 0) {
            var town = iterator.next();
            int distance = town.getDistance();
            System.out.println(previousTown + " -> " + town.getName() + " distance is: " + (distance - previousDistance) + "km"  );
            previousTown = town.getName();
            previousDistance = distance;
            times++;
        }
        System.out.println("Trip ends at " + list.getLast().getName() );
    }
    public static void printItinerary4(LinkedList<Town> list, int number) {
        System.out.println("Trip Ends at " + list.getLast().getName());
        String previousTown = list.getLast().getName();
        int previousDistance = list.getLast().getDistance();
        ListIterator<Town> iterator = list.listIterator(number + list.size()-1);
        int times = 0;
        while (times == 0) {
            var town = iterator.previous();
            int distance = town.getDistance();
            System.out.println(previousTown + " -> " + town.getName() + " distance is: " + (previousDistance - distance) + "km"  );
            previousTown = town.getName();
            previousDistance = distance;
            times++;
        }
        System.out.println("Trip starts at " + list.getFirst().getName() );
    }
}
