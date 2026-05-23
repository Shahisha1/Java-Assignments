class Students{
    String name;
    int[] marks = new int[3];

    Students(String name, int m1, int m2, int m3) {
        this.name  = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    double calculateAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    String result() {
        return calculateAverage() >= 40 ? "Pass" : "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");
        System.out.println();
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result:  " + result());
    }
}

public class Scores {
    public static void main(String[] args) {
        Students s = new Students("Sasha", 75, 82, 68);
        s.display();
    }
}
