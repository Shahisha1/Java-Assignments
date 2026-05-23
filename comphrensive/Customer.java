class Discount {
    String  name;
    boolean isMember;
    double  Amt;

    Discount(String name, boolean isMember, double Amt) {
        this.name = name;
        this.isMember= isMember;
        this.Amt = Amt;
    }
    void displayFinalAmount() {
        double finalAmount;
        if (isMember && Amt > 1000) {
            double discount = Amt * 0.15;
            finalAmount = Amt - discount;
            System.out.println(name + " gets 15% discount.");
        } else {
            finalAmount = Amt;
            System.out.println(name + " gets no discount.");
        }
        System.out.println("Amount Payable: Rs." + finalAmount);
    }
}

public class Customer {
    public static void main(String[] args) {
        Discount c1 = new Discount("Sasha", true,  1500);
        Discount c2 = new Discount("Astroid", false, 2000);

        c1.displayFinalAmount();
        System.out.println();
        c2.displayFinalAmount();
    }
}
