class Laptop {
    String brand;
    int ramSize;
    int storage;

    Laptop(String brand, int ramSize, int storage) {
        this.brand   = brand;
        this.ramSize = ramSize;
        this.storage = storage;
    }

    void displaySpecs() {
        System.out.println("Brand: "   + brand);
        System.out.println("RAM: "     + ramSize + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}

public class LaptopSpecs {
    public static void main(String[] args) {
        Laptop[] laptops = {
                new Laptop("Dell",   16, 512),
                new Laptop("Lenovo",  4, 256),
                new Laptop("Apple",   8, 256)
        };

        System.out.println("Laptops with 8 GB RAM or more:");
        for (Laptop l : laptops) {
            if (l.ramSize >= 8) {
                l.displaySpecs();
                System.out.println("---");
            }
        }
    }
}
