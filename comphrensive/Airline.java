class Ticket {
    String passengerName;
    String travelClass;
    double basePrice;

    Ticket(String passengerName, String travelClass, double basePrice) {
        this.passengerName = passengerName;
        this.travelClass= travelClass;
        this.basePrice = basePrice;
    }

    double getFinalPrice() {
        switch(travelClass) {
            case "Business":
                return basePrice * 1.30;
            case "First":
                return basePrice * 1.50;
            default:
                return basePrice;
        }
    }

    void displayTicket() {
        System.out.println("Passenger:    " + passengerName);
        System.out.println("Class:        " + travelClass);
        System.out.println("Base Price:   ₹" + basePrice);
        System.out.println("Final Price:  ₹" + getFinalPrice());
    }
}

public class Airline {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Sasha", "Economy",  5000);
        Ticket t2 = new Ticket("Kala", "Business", 5000);
        Ticket t3 = new Ticket("Shreya",  "First",    5000);

        t1.displayTicket(); System.out.println();
        t2.displayTicket(); System.out.println();
        t3.displayTicket();
    }
}
