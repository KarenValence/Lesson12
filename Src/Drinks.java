public class Drinks {
    private int DrinksCounter;
    private double TotalPrice;

    public int getDrinksCounter() {
        return DrinksCounter;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }
    public static void Menu() {
        DrinksMachine[] drinks = DrinksMachine.values();
        System.out.println("Menu");
        for (int i = 1; i < drinks.length ; i++) {
            System.out.printf("\t%d. %s - price: %.2f\n", i, drinks[i-1],drinks[i-1].getPrice());
        }
        System.out.println("Type 0 or exit");
    }
    public void orderDrinks(DrinksMachine drinksMachine){
        switch (drinksMachine){
            case COFFEE:
                DrinksCounter ++;
                TotalPrice += DrinksMachine.COFFEE.getPrice();
                System.out.printf("", drinksMachine);
                break;
        }
        switch (drinksMachine){
            case TEA:
                DrinksCounter ++;
                TotalPrice += drinksMachine.TEA.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
        switch (drinksMachine){
            case LIMONADE:
                DrinksCounter ++;
                TotalPrice += drinksMachine.LIMONADE.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
        switch (drinksMachine){
            case MOJITO:
                DrinksCounter ++;
                TotalPrice += drinksMachine.MOJITO.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
        switch (drinksMachine){
            case MINERAL_WATER:
                DrinksCounter ++;
                TotalPrice += drinksMachine.MINERAL_WATER.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
        switch (drinksMachine){
            case COCA_COLA:
                DrinksCounter ++;
                TotalPrice += drinksMachine.COCA_COLA.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
        switch (drinksMachine){
            case COFFEE:
                DrinksCounter ++;
                TotalPrice += drinksMachine.COFFEE.getPrice();
                System.out.printf("Making %s...", drinksMachine);
                break;
        }
    }
    public DrinksMachine getDrinksMachineDrink(String drink){
        DrinksMachine[] drinks = DrinksMachine.values();
        for (int i = 1; i < drinks.length; i++) {
            if (drinks[i-1].toString().equalsIgnoreCase(drink) || drink.equalsIgnoreCase(String.valueOf(i)) ){
                return drinks[i-1];
            }
        }
        return DrinksMachine.NOTHING;
    }
}
