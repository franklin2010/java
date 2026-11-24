public class numberChecker {
    public static void main(String[] args) {
        for (int num1 = 1; num1 < 10; num1++) {
            for (int num2 = 0; num2 < 10; num2++) {
                for (int num3 = 0; num3 < 10; num3++) {
                    int square = (num1 * num1) + (num2 * num2) + (num3 * num3);
                    int number = (num1 * 100) + (num2 * 10) + num3;
                    if (square == number) {
                        System.out.println(number);
                    }
                }
            }
        }
    }
}
