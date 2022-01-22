import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int amountOfDays = ((h - b) + ((a - b) - 1)) / (a - b);

        System.out.println(amountOfDays);

    }
}