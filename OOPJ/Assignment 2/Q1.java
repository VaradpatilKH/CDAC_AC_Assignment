import java.util.Scanner;

class Bill{
        int number ;
        String name;
        int unit;
        double res;

        Bill(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" customer name: ");
        name = sc.next();

        System.out.print(" consumer number: ");
        number = sc.nextInt();

        System.out.print(" Units: ");
        unit = sc.nextInt();
        }
        double cal(){
                    if(unit <= 100){
            res = unit * 5;

        }
        else if(unit <= 200){
            res = 100*5 + (unit - 100) * 7;
        }
        else{
            res = 100*5 + (unit - 100) * 7 + (unit - 200) * 10;
        }

        if(res > 1500){
            res = res + res * 0.05;
        }
        return res;
        }
}

public class Q1 {

    public static void main(String[] args) {
        Bill b = new Bill();
        System.out.println(" customer name: "+ b.name);
        System.out.println(" consumer number: "+ b.number);
        System.out.println(" Units: "+ b.unit);
        System.out.println(" Total Bill: "+ b.cal());
    }
    
}
