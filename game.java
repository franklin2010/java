import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int constant_number = 50;
        int trials = 10;

        while (trials > 0) {
            System.out.print("Think of a number from one to hundred: ");
            int number = input.nextInt();

            if (number == constant_number) {
                System.out.println("Correct");
                trials = 0;
            } else {
                trials -= 1;
                System.out.println("You dey mad");
                System.out.println("attempts left:  " + trials);
            }
        }
    }
}
