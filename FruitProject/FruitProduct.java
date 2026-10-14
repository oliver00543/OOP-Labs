public abstract class FruitProduct implements FruitInterface {
    protected String id;
    protected String name;
    protected double price;

    public FruitProduct(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public final String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract String toString();
}
