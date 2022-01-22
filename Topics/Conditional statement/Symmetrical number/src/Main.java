import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        
        final int ten = 10;
        final int hundered = 100;
        final int thousand = 1000;
        
        int fourthDigit = number % ten; // 4
        int thirdDigit = (number / ten) % ten; // 3
        int secondDigit = (number / hundered) % ten; // 2
        int firstDigit = (number / thousand) % ten; // 1
        
        boolean check = firstDigit == fourthDigit && secondDigit == thirdDigit;
        
        if (number < 0) {
            System.out.println(2);
        } else if (check) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
