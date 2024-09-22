import java.util.*;

public class Magicboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the digits: ");
        String input = sc.next();


        if (input.length() != 8) {
            System.out.println("Invalid input. Please enter exactly 8 digits.");
            return;
        }


        for (int i = 0; i < input.length(); i += 2) {
            String digitPair = input.substring(i, i + 2); // Extract two digits
            int asciiValue = Integer.parseInt(digitPair); // Convert to integer
            char correspondingChar = (char) asciiValue;   // Convert to character


            System.out.println(asciiValue + "-" + correspondingChar);
        }

        sc.close();
    }
}
