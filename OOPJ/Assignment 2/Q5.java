import java.util.*;
public class Q5 {

    public static void calculate(double s){
        double HRA = s * 0.2;
        double DA = s * 0.1;
        double PF = s * 0.08;

        double net = s + HRA + DA - PF;
        
        System.out.println(s + " " + HRA + " " + DA + " " + PF);
        System.out.println(net);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        double sal = sc.nextDouble();
        calculate(sal);

    }
}
