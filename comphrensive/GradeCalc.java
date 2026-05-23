class Subject {
    String subjectName;
    int marks;

    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    char getGrade() {
        if
        (marks >= 90)
            return 'A';
        else if
        (marks >= 80)
            return 'B';
        else if
        (marks >= 70)
            return 'C';
        else
            return 'D';
    }

    void display() {
        System.out.println(subjectName + " | Marks: " + marks + " | Grade: " + getGrade());
    }
}

public class GradeCalc {
    public static void main(String[] args) {
        Subject[] subjects = {
                new Subject("Mathematics II", 92),
                new Subject("Digital Systems",     85),
                new Subject("Object Orient Programming",   73),
                new Subject("Business Communications",     67),
                new Subject("Data Structure and Algorithm",     91)
        };

        System.out.println("Subject          Marks  Grade");
        for (Subject s : subjects) s.display();
    }
}
