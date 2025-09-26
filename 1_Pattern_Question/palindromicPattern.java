public class palindromicPattern {
       public static void main(String[] args) {
        int n = 5;

        // outterLOop
        for (int i = 1; i <= n; i++) {

            // forSpace
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // forDescending
             for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // for ascendingOrder
           for (int j = 2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
