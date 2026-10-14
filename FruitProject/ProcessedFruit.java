public class ProcessedFruit extends FruitProduct {
    private String packagingType;

    public ProcessedFruit(String id, String name, double price, String packagingType) {
        super(id, name, price);
        this.packagingType = packagingType;
    }

    public String getPackagingType() {
        return packagingType;
    }

    @Override
    public String toString() {
        return "Processed Fruit [ID: " + id + ", Name: " + name + ", Price: " + price + " THB, Packaging: " + packagingType + "]\n";
    }
}
