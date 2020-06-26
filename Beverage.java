package machine;

public enum Beverage {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    private final int water;
    private final int milk;
    private final int beans;
    private final int price;

    Beverage(int water, int milk, int beans, int price) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.price = price;
    }

    public int needWater() {
        return water;
    }

    public int needMilk() {
        return milk;
    }

    public int needBeans() {
        return beans;
    }

    public int getPrice() {
        return price;
    }
}
