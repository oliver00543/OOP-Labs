public class FreshFruit extends FruitProduct {
    private int shelfLifeDays;

    public FreshFruit(String id, String name, double price, int shelfLifeDays) {
        super(id, name, price);
        this.shelfLifeDays = shelfLifeDays;
    }

    public int getShelfLifeDays() {
        return shelfLifeDays;
    }

    public boolean isExpiringSoon() {
        return shelfLifeDays <= 3;
    }

    @Override
    public String toString() {
        return "Fresh Fruit [ID: " + id + ", Name: " + name + ", Price: " + price + " THB, Shelf Life: " + shelfLifeDays + " days]\n";
    }
}
