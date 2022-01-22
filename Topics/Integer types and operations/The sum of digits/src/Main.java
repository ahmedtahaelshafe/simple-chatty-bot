import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        final int hundered = 100;
        final int ten = 10;

        int firstDigit = input / hundered;
        int secondDigit = (input - firstDigit * hundered) / ten;
        int thirdDigit = input - (firstDigit * hundered) - (secondDigit * ten);

        int output = firstDigit + secondDigit + thirdDigit;

        System.out.println(output);

    }
}