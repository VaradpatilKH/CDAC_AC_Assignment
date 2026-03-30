import java.util.*;
import java.util.function.Function;


        

public class Q2 {


    static void avg(int t){
            double avg = t/5;
            System.out.println("Average :" + avg);
        }
    static double percentage(int t){
            double per = t*100/250;
            return per;
        }
    static String calgrade(int t,Function<Integer,Double> func){
        double per = func.apply(t);
        if(per >= 90){
            return "A";
        }
        else if(per >= 75){
            return "B";
        }
        else if(per >= 60){
            return "C";
        }
        else if(per >= 40){
            return "D";
        }
        else{
            return "Fail";
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name = sc.next();
        System.out.print("Enter the Roll no: ");
        int roll_no = sc.nextInt();
        System.out.println("Enter the 5 Subjects Marks: ");
        int marks[] = new int[5];
        int total = 0;
        for(int i = 0; i < 5; i++){
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        System.out.println("Name: " + name);
        System.out.println("Roll No. : " + roll_no);
        System.out.println("Total Marks : " + total);
        avg(total);
        System.out.println("Percentage is: "  + percentage(total));
        System.out.println("The Grade is: " + calgrade(total,Q2::percentage));
    }
}
