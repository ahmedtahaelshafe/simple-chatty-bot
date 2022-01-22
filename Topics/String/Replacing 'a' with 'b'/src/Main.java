import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.next();
        String output = input.replace('a', 'b');
        System.out.println(output);
    }
}