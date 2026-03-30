import java.util.Scanner;

public class Q27_MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        String[] subjects = {"Maths", "Science", "English", "History", "Computer"};

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        for (int m : marks) {
            total += m;
        }
        double percentage = (double) total / 5;
        String grade;

        if (percentage >= 90) grade = "A";
        else if (percentage >= 75) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 40) grade = "D";
        else grade = "Fail";

        System.out.println("\nTotal : " + total);
        System.out.printf("Percentage : "+ percentage);
        System.out.println("Grade : " + grade);

    }
}
