import java.util.Scanner;
class Bill{
    String  name;
    int quantity;
    double price;
    double total;

    Bill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter Quantity :");
        quantity = sc.nextInt();
        System.out.print("Enter price :");
        price = sc.nextDouble();
        total = price * quantity;
    }
    void display(){
        System.out.println(name + "\t" + quantity + "\t" + price + "\t" + total);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number items: ");
        int n = sc.nextInt();
        Bill items[] = new Bill[n];
        double grandtotal = 0.0;

        for(int i = 0; i < n; i++){
            System.out.println("Enter" + " " + (i+1) + " " + "item :");
            items[i] = new Bill();
        }
        System.out.println("sr no. \tname \tqty \tprice \ttotal");
        for(int i = 0; i < n; i++){
            System.out.print((i+1) + "\t");
            items[i].display();
            grandtotal += items[i].total;
        }
        System.out.println("Total is :" + grandtotal);
    }
}
