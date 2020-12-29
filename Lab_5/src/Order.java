public class Order {


    private final Menu food;

    public Order(Menu food) {
        this.food = food;
    }

    public double getAmount() {
        return food.getPrice();
    }
    @Override
    public String toString() {
        return "Order: " + food.getName() +
                "Total price: " + getAmount();
    }
}

