package LinkedLists;

import java.util.Scanner;
import java.util.LinkedList;

record Place(String name, int distance){

    @Override
    public String toString(){
        return String.format("%s (%d)", name, distance);
    }
}

public class Challenge {
    public static void main(String[] args) {
        LinkedList<Place> listOfPlaces = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(listOfPlaces, adelaide);
        addPlace(listOfPlaces, new Place ("adelaide", 1374));
        addPlace(listOfPlaces, new Place ("Brisbane", 917));
        addPlace(listOfPlaces, new Place ("Perth", 3923));
        addPlace(listOfPlaces, new Place ("Alice Springs", 2771));
        addPlace(listOfPlaces, new Place ("Darwin", 3972));
        addPlace(listOfPlaces, new Place ("Melbourne", 877));
        listOfPlaces.addFirst(new Place("Sydney", 0));
        System.out.println(listOfPlaces);

        var iterator = listOfPlaces.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false, forward = true;

        printOptions();

        while(!quitLoop){
            if (!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward=true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final : " + iterator.previous());
                forward=false;
            }

            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch(menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward){  // reversing direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next(); // adjusting position forward
                        }
                    }
                    if (iterator.hasNext()) System.out.println(iterator.next());
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward){  // reversing direction
                    forward = false;
                    if (iterator.hasPrevious()) {
                        iterator.previous(); // adjusting position backwards
                    }
                }
                    if (iterator.hasPrevious()) System.out.println(iterator.previous());
                    break;
                case "M":
                    printOptions();
                    break;
                case "L":
                    System.out.println(listOfPlaces);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if (list.contains(place)) {
            System.out.println("Place already exists");
            return;
        }

        for (Place p : list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Place " + place.name() + " already exists");
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list){
            // here distance() is the accessor method;
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void printOptions(){
        System.out.println("""
                Available actions (type word or character):
                1. (F)orward
                2. (B)ackward
                3. (L)ist Places
                4. (M)enu
                5. (Q)uit""");
    }
}

