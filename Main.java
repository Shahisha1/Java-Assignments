class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shahisha";
        s.age = 19;
        s.displayInfo();
    }
}