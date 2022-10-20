import java.util.*;

public class Recipe {

    private String name;
    private double totalCost;
    private Set<Product> products = new HashSet<>();

    public Recipe(String name, Product... products) {
        this.name = name;
        for (Product product : products) {
            addProduct(product);
        }
        this.totalCost = 0.0;
        for (Product product : products) {
            this.totalCost += product.getPrice();
        }
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    private void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.totalCost, totalCost) == 0 && name.equals(recipe.name) && products.equals(recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", totalCost=" + totalCost +
                ", products=" + products +
                '}';
    }
}
