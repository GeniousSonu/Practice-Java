import java.util.*;

public class Movie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Price of Products

        int pizza = 100;
        int puffs = 20;
        int cooldrink = 10;

        System.out.print("Enter the no of pizzas bought: ");
        int pizzapiece = sc.nextInt();

        System.out.print("Enter the no of puffs bought: ");
        int puffspiece = sc.nextInt();

        System.out.print("Enter the no of cool drinks bought: ");
        int drinkspiece = sc.nextInt();

        int bills = (pizza* pizzapiece) + (puffs*puffspiece) + (cooldrink*drinkspiece);

        System.out.println("No of Pizzas: " +pizzapiece);
        System.out.println("No of Puffs: " +puffspiece);
        System.out.println("No of Cooldrinks: " +drinkspiece);
        System.out.println("Total Price = " + bills);

        sc.close();
    }
}
