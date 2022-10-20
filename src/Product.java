import java.util.Objects;

public class Product {

    private String productName;
    private double price;
    private double weight;

    public Product(String productName, double price, double weight) throws NullFillingDataException {
        setProductName(productName);
        setPrice(price);
        setWeight(weight);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) throws NullFillingDataException {
        if (productName == null) {
            throw new NullFillingDataException("Заполните карточку товара полностью!");
        }
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws NullFillingDataException {
        if (price <= 0.0) {
            throw new NullFillingDataException("Заполните карточку товара полностью!");
        }
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws NullFillingDataException {
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
