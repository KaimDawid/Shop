import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tire.tireBase.add(new Tire("Snow", "Kormoran", 16, 200, 55, 199.99));
        Tire.tireBase.add(new Tire("Cruiser", "Dębica", 13, 265, 60, 239.99));
        Tire.tireBase.add(new Tire("City", "Pirelli", 14, 160, 45, 189.99));
        Tire.tireBase.add(new Tire("Frigo", "Dębica", 16, 200, 55, 259.99));
        Tire.tireBase.add(new Tire("Monero", "Pirelli", 18, 235, 65, 179.99));
        Tire.tireBase.add(new Tire("Vaticano", "Imperial", 13, 190, 45, 229.99));


        int selectPerimeter;
        int selectWidth;
        int selectProfile;


        Tire.displayTires();
        System.out.println("Search tires: ");
        System.out.println("Provide perimeter: ");
        selectPerimeter = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Provide width: ");
        selectWidth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Provide profile: ");
        selectProfile = scanner.nextInt();
        scanner.nextLine();

        System.out.println(selectPerimeter + " " + selectWidth + " " + selectProfile);

        Tire.searchTires(selectPerimeter, selectWidth, selectProfile);

    }
}
