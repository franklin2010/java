import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        double average = 0;

        while (true) {
            System.out.print("Put number(Enter -1 to stop): ");
            int number = input.nextInt();

            if (number == -1) {
                System.out.println("The overall average is " + average);
                break;
            } else {
                counter += 1;
                sum += number;
                average = (double) sum / counter;
                System.out.println("Average = " + average);
            }
        }
    }
}
