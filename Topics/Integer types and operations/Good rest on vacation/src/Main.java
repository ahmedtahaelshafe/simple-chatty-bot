import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int durationInDays = scanner.nextInt();
        int numberOfNights = durationInDays - 1;
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelNightCost = scanner.nextInt();

        int totalFoodCost = foodCostPerDay * durationInDays;
        int totalHotelCost = hotelNightCost * numberOfNights;
        int totalFlightCost = flightCost * 2;

        int result = totalFoodCost + totalHotelCost + totalFlightCost;

        System.out.println(result);
        // put your code here
    }
}