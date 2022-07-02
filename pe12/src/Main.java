import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Select your program :\s
                1 - Retail Price Calculator
                2 - Celsius to Fahrenheit
                Your choice :\s""");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> new PriceCalculator();
            case 2 -> new CelsiusToFahrenheit();
            default -> System.out.println("Bad choice");
        }
    }

}
