import java.util.Scanner;

public class optimizedApproach {
    public static boolean isPrime(int num) {
        // boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}
