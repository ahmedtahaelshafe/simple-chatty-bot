import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean vertical = x1 == x2;
        boolean horizontal = y1 == y2;
        boolean diagonal = Math.abs(x1 - x2) == Math.abs(y1 - y2);

        boolean check = vertical || horizontal || diagonal;

        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}