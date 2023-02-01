import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class Tire {

    public static ArrayList<Tire> tireBase = new ArrayList<>();

    String name;
    String longName;
    String brand;
    int perimeter;

    double width;
    int profile;

    double price;

    public Tire(String name, String brand, int perimeter, double width, int profile, double price) {
        this.name = name;
        this.longName = brand + " " + name +" " + width + "cm";
        this.brand = brand;
        this.perimeter = perimeter;

        this.width = width;
        this.profile = profile;
        this.price = price;
    }


    public static void displayTires(){

        for (int i = 0; i < tireBase.size(); i++) {

            System.out.println("Tire: " + tireBase.get(i).getLongName());
            System.out.println("Brand: " + tireBase.get(i).getBrand());
            System.out.println("Profile: " + tireBase.get(i).getProfile());
            System.out.println("Perimeter: " + tireBase.get(i).getPerimeter());
            System.out.println("Width: " + tireBase.get(i).getWidth());
            System.out.println("Price: " + tireBase.get(i).getPrice() + "zl \n \n ");
        }

    }


    public static void searchTires(int perimeter, int width, int profile){

        for (int i = 0; i < tireBase.size(); i++) {

            if (perimeter == tireBase.get(i).getPerimeter() && width == tireBase.get(i).getWidth() && profile == tireBase.get(i).getProfile()) {

                System.out.println("Tire: " + tireBase.get(i).getLongName());
                System.out.println("Brand: " + tireBase.get(i).getBrand());
                System.out.println("Profile: " + tireBase.get(i).getProfile());
                System.out.println("Perimeter: " + tireBase.get(i).getPerimeter());
                System.out.println("Width: " + tireBase.get(i).getWidth());
                System.out.println("Price: " + tireBase.get(i).getPrice() + "zl \n \n ");

            }

        }

    }



}
