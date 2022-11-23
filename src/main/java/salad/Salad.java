package salad;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salad {

    private final List<Products> products;

    public Salad(Products ... products) {
        this.products = List.of(products);
    }

    protected static void filterProducts(List<Products> product) {
        product.stream()
                .filter(products -> products.getCalories()<20)
                .filter(products -> products.getQuantity()>2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    protected static void sortedProducts(List<Products> product) {
        product.stream()
                .sorted(Comparator.comparing(Products::getCalories))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    protected static void getCalorieSum(List<Products> product) {
        int calorieSum = product.stream()
                .mapToInt(val -> val.calories * val.quantity)
                .sum();
        System.out.println(calorieSum);
    }

    protected static void collectSalad(List<Products> product) {
        product.stream()
                .map(Products::getName)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
