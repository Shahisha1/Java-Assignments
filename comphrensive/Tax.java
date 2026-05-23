class TaxPayer {
    String name;
    double income;

    TaxPayer(String name, double income) {
        this.name   = name;
        this.income = income;
    }

    double calculateTax() {
        if(income < 250000)
            return 0;
        else if (income >= 250000 && income < 500000)
            return income * 0.10;
        else if (income >= 500000 && income < 1000000)
            return income * 0.20;
        else
            return income * 0.30;
    }

    void displayTax() {
        System.out.println("Name:        " + name);
        System.out.println("Income:      Rs." + income);
        System.out.println("Tax Payable: Rs." + calculateTax());
    }
}

public class Tax {
    public static void main(String[] args) {
        TaxPayer tp = new TaxPayer("Sasha", 750000);
        tp.displayTax();
    }
}
