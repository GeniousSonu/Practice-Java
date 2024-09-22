import java.util.*;

public class Fuel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input From The User
        System.out.print("Enter the no of Liters to fill the Tank: ");
        int fuel = sc.nextInt();

        System.out.print("Enter the Distance Covered: ");
        int dist = sc.nextInt();

        // Check if input is valid
        if (fuel > 0 && dist > 0) {
            // European style (Liters per 100 KM)
            double indfuel = ((double) fuel / dist) * 100;

            // US style (Miles per Gallon)
            double usfuel = ((dist * 0.6214) / (fuel * 0.2642));

            // Display results
            System.out.printf("Liters/100KM: %.2f\n", indfuel);
            System.out.printf("Miles/gallons: %.2f\n", usfuel);

        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
