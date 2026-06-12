class MobilePhone {
    String brand;
    String model;
    private double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void   setPrice(double p)  {
        this.price = p;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + getPrice());
    }
}

public class Phones {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 74999.00);
        phone.displayDetails();

        phone.setPrice(69999.00);
        System.out.println("Updated Price: " + phone.getPrice());
    }
}
