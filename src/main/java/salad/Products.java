package salad;

public abstract class Products {

    protected String name;
    protected int quantity;
    protected int calories;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", calories=" + calories +
                '}';
    }
}