import java.util.Scanner;

public class prime {
     public static void checkprime(int n){
            boolean isprime = true;
            if (n <= 1) {
                isprime = false;
            }  
            
            for ( int i = 2 ; i<n ; i++){
                if ( n % i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime==true){
                System.out.print(n+" is prime number");
                
            }
            else{
                System.out.print(n+" is not a prime number");
            }
       }
    public static void main(String[] args) {

        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkprime(n);
    }

    }
    

