package templatemethod.duck;

import java.util.Arrays;

public class SortDucks {

    public static void main(String[] args) {
        Duck[] ducks = createDucks();
        System.out.println("Before sorting:");
        displayDucks(ducks);

        Arrays.sort(ducks);

        System.out.println("After sorting:");
        displayDucks(ducks);

        //335
    }

    private static Duck[] createDucks() {
        return new Duck[]{
                new Duck("Duck A", 8),
                new Duck("Duck B", 2),
                new Duck("Duck C", 7),
                new Duck("Duck D", 2),
                new Duck("Duck E", 10),
                new Duck("Duck F", 2)
        };
    }

    private static void displayDucks(Duck[] ducks) {
        Arrays.stream(ducks).forEach(System.out::println);
        System.out.println();
    }

}
