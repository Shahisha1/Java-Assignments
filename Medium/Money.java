public class Money {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sasha", 50000.999, 7);
        Employee emp2 = new Employee("Astroid", 30000.999, 4);

        System.out.println("Bonus of " + emp1.name + " is " + emp1.calculateBonus());
        System.out.println("Bonus of " + emp2.name + " is " + emp2.calculateBonus());
    }
}

class Employee{
    String name;
    double salary;
    int yearsOfExperience;

    public Employee(String name, double salary, int years){
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = years;
    }

    public double calculateBonus(){
        if(yearsOfExperience > 5){
            return (20*salary) / 100;
        }
        else{
            return (10 * salary)/ 100;
        }
    }

}
