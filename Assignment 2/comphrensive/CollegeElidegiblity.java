class Student {
    String name;
    String stream;
    Student(String name, String stream) {
        this.name   = name;
        this.stream = stream;
    }
    void displayEligibleCourses() {
        System.out.println("Student: " + name + " , Stream: " + stream);
        System.out.print("Eligible Courses: ");
        switch (stream) {
            case "Science":
                System.out.println("B.Sc, B.Tech, MBBS");
                break;
            case "Commerce":
                System.out.println("B.Com, BBA, CA, Economics");
                break;
            case "Arts":
                System.out.println("BA, Journalism, Law");
                break;
            default:
                System.out.println("Enter a valid option");
        }
    }
}
public class CollegeElidegiblity {
    public static void main(String[] args) {
        Student s1 = new Student("Kala",  "Science");
        Student s2 = new Student("Shahisha", "Commerce");
        Student s3 = new Student("Shreya", "Arts");

        s1.displayEligibleCourses();
        s2.displayEligibleCourses();
        s3.displayEligibleCourses();
    }
}
