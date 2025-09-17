import java.util.Scanner;

public class PrimeNo_inRange {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a range to print prime number: ");
        int range = sc.nextInt();
                System.out.print(" These are all the prime number in this range : ");

        for (int i = 1; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }
}
