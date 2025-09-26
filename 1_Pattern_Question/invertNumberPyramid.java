public class invertNumberPyramid {
    public static void main(String[] args) {
        int n=6;

        for (int i = 1; i <= n; i++) {
            // forSpace
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // forNumber
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
