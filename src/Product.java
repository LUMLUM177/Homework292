import java.util.Objects;

public class Product {

    private String productName;
    private double price;
    private double weight;

    public Product(String productName, double price, double weight) {
        setProductName(productName);
        setPrice(price);
        setWeight(weight);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null) {
            throw new NullFillingDataException("Заполните карточку товара полностью!");
        }
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0.0) {
            throw new NullFillingDataException("Заполните карточку товара полностью!");
        }
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0.0) {
            throw new NullFillingDataException("Заполните карточку товара полностью!");
        }
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (productName.equals(product.productName)) {
            throw new DuplicateProductException("Нельзя добавить уже имеющийся продукт!");
        }
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return getProductName();
    }
}
