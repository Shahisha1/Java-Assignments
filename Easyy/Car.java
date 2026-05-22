class vroom {
    String brand;
    String model;
    int year;

    vroom(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand +", Model: "+ model+", Year: " + year);
    }
}

public class Car {
    public static void main(String[] args) {
        vroom car1 = new vroom("Ferrari", "SF90 Stradale", 2024);
        vroom car2 = new vroom("Porsche", "911", 2025);
        vroom car3 = new vroom("McLaren","720S", 2017);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
