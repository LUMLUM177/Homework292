import java.util.*;

public class Main {
    public static void main(String[] args) throws NullFillingDataException {

        Product banana = new Product("Банан", 50, 5);
        Product orange = new Product("Апельсин", 100, 4);
        Product apple = new Product("Яблоко", 70, 3);
        Product kiwi = new Product("Киви", 150, 2);
        Product milk = new Product("Молоко", 80, 1);
        Product meat = new Product("Мясо", 300, 0.350);
        Product salat = new Product("Салат", 25, 0.100);
        Product mayonnaise = new Product("Майонез", 125, 0.315);

        Recipe cezar = new Recipe("Цезарь", meat, salat, mayonnaise);
        Recipe kaleidoscope = new Recipe("Калейдоскоп", meat, salat, mayonnaise);
        Recipe milkCocktaile = new Recipe("Молочный коктейль", apple, banana, milk);
        Recipe fructesSalat = new Recipe("Фруктовый салат", kiwi, banana, orange);

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(cezar);
        recipes.add(milkCocktaile);
        recipes.add(kaleidoscope);
        recipes.add(fructesSalat);

        System.out.println(recipes);
        System.out.println();

        int size = 20;
        List<Integer> numbers = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1001));
        }

        System.out.println(numbers);

        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            if (next % 2 != 0) {
                iter.remove();
            }
        }

        System.out.println(numbers);

    }
}