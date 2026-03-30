
public class Q15 {
    public static void main(String[] args) {

        int[][] marks = {
            {85, 90, 78},   
            {70, 65, 80},   
            {92, 88, 95}    
        };

        String[] students = {"Varad", "Aman", "Suraj"};
        String[] subjects  = {"Maths", "Science", "English"};

        System.out.println("Student | " + subjects[0] + " | " + subjects[1] + " | " + subjects[2] + " | Total | Avg");
        System.out.println("--------------------------------------------------");
 
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double avg = total / 3.0;
 
            System.out.println(students[i] + " | " + marks[i][0] + " | " + marks[i][1] + " | " + marks[i][2] + " | " + total + " | " + avg);
        }

    }
    }

