import java.util.Scanner;

public class Baguio {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your Username");
        String name = myObj.nextLine();
        System.out.println("This is " + name + " Algorithm");

        // Step 1
        System.out.println("Step 1: Wake up");

        // Step 2: Take a Bath or use Perfume
        System.out.print("Step 2: Take a Bath? (yes/no): ");
        String bathChoice = myObj.nextLine();

        if ("yes".equalsIgnoreCase(bathChoice)) {
            System.out.println("You chose to take a bath.");
        } else if ("no".equalsIgnoreCase(bathChoice)) {
            System.out.println("You chose not to take a bath. Consider using perfume.");
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
        }

        // Step 3
        System.out.println("Step 3: Brush my Teeth");

        // Step 4: Change clothes and check the temperature
        System.out.print("Step 4: Enter the current temperature in Celsius: ");
        double temperature = myObj.nextDouble();

        // Check if the temperature is between 15 and 23 degrees
        if (temperature <= 23) {
            System.out.println("It's cold, I will wear a jacket.");
        } else {
            System.out.println("It's not too cold, I might not need to wear a jacket.");
        }

        // Step 5
        System.out.println("Step 5: Prepare things for school");

        // Step 6

        System.out.println("Step 6: Find a ride");


        // Consume the newline character
        myObj.nextLine();

        // Step 6.1: Choose transportation
        System.out.print("Choose transportation (jeep/taxi): ");
        String transportChoice = myObj.nextLine();

        // Step 6.2: Calculate and display cost
        if ("jeep".equalsIgnoreCase(transportChoice)) {
            System.out.println("You chose to ride a jeep. Cost: -10 pesos.");
        } else if ("taxi".equalsIgnoreCase(transportChoice)) {
            System.out.println("You chose to ride a taxi. Cost: -180 pesos.");
        } else {
            System.out.println("Invalid choice. Please enter 'jeep' or 'taxi'.");
        }
        // Step 7
        System.out.println("Step 7: Enter UC");

        // Step 8
        System.out.println("Step 8: After First Period, Eat");

        // Step 9
        System.out.println("Step 9: Go Back to School");

        // Step 10
        System.out.println("Step 10: After Break, Hangout in SM");

        // Additional Step 11
        System.out.println("Step 11: Go Home");

        // Closing the scanner to avoid resource leaks
        myObj.close();
    }
}











