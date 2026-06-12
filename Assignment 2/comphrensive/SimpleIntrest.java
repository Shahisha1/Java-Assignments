class Variables {
    private double principal;
    private double rate;
    private double time;

    Variables(double principal, double rate, double time) {
        this.principal = principal;
        this.rate= rate;
        this.time= time;
    }

    double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    void display() {
        System.out.println("Principal: Rs." + principal);
        System.out.println("Rate: "+ rate + "%");
        System.out.println("Time: "+ time + " years");
        System.out.println("Simple Interest: Rs."  + calculateInterest());
    }
}

public class SimpleIntrest {
    public static void main(String[] args) {
        Variables si = new Variables(50000, 8.5, 3);
        si.display();
    }
}
