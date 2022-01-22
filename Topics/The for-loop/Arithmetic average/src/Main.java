import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        int counter = 0;

        for (int i = a ; i <= b ; i++) {
            if (i % 3 == 0) {
                sum += i;
                counter++;
            }
        }

        double result = (double) sum / (double) counter;

        System.out.println(result);
    }
}