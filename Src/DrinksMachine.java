public enum DrinksMachine {
    COFFEE(1.5),
    TEA(1),
    LIMONADE(2.5),
    MOJITO(2.75),
    MINERAL_WATER(2),
    COCA_COLA(2.5),
    NOTHING(0.0);

    private final double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
