public class inverted_star_Pattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int star = 5; star >= line; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
