import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int firstGroupRemainder = firstGroup % 2;
        int secondGroupRemainder = secondGroup % 2;
        int thirdGroupRemainder = thirdGroup % 2;

        int firstGroupDesks = firstGroup / 2 + firstGroupRemainder;
        int secondGroupDesks = secondGroup / 2 + secondGroupRemainder;
        int thirdGroupDesks = thirdGroup / 2 + thirdGroupRemainder;

        int totalMinimumDesks = firstGroupDesks + secondGroupDesks + thirdGroupDesks;

        System.out.println(totalMinimumDesks);

    }
}