
public class Q12 {

    String name;
    int rollNo;

    static int totalStudents = 0;

    Q12(String name, int rollNo) {
        this.name   = name;
        this.rollNo = rollNo;
        totalStudents++; 
    }

    static void displayCount() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails() {
        System.out.println("Name: " + name + " | Roll No: " + rollNo);
    }

    public static void main(String[] args) {

        Q12 s1 = new Q12("Suraj Patil",   1);
        Q12 s2 = new Q12("Varad Patil",   2);
        Q12 s3 = new Q12("Kunal Patil",  3);
        Q12 s4 = new Q12("Aman Jha",  4);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        displayCount();

    }
}
