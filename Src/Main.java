import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Drinks drinks = new Drinks();
        Scanner scanner = new Scanner(System.in);
        while (true){
            Drinks.Menu();
            String drink = scanner.nextLine();
            if (drink !=null && (drink.equalsIgnoreCase("exit")|| drink.equalsIgnoreCase("0"))){
                break;
            }
            DrinksMachine choice = drinks.getDrinksMachineDrink(drink);
            drinks.orderDrinks(choice);

            System.out.printf("Current price %s = %.2f \n", choice, choice.getPrice());
        }
        System.out.printf("Total price(%d) = %.2f", drinks.getDrinksCounter(), drinks.getTotalPrice());
    }
}
