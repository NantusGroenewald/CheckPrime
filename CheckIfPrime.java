import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        try( Scanner sc = new Scanner(System.in) ) {
            boolean prime = false; 

            int num = sc.nextInt();
            if ( num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        prime = false; 
                        break; 
                    }
                    else{
                        prime = true; 
                    }
                }
            }
            if (prime == true ) {
                System.out.println(num +" is a prime number");
            }
            else{
                System.out.println(num + " is not a prime number");
            }
        }
    }
}
