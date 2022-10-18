package salad;

import java.util.ArrayList;
import java.util.List;

import static salad.Salad.*;

public class PrepareSalad {

    public static void main(String[] args) {

        Tomato tomato = new Tomato("Tomato", 15, 3);
        Cucumber cucumber = new Cucumber("Cucumber", 13, 3);
        SweetPepper sweetPepper = new SweetPepper("SweetPepper", 10, 2);
        Eggs eggs = new Eggs("Eggs", 25, 5);
        Sauce sauce = new Sauce("Souce", 45, 1);

        List<Products> product = new ArrayList<>();
        product.add(tomato);
        product.add(cucumber);
        product.add(sweetPepper);
        product.add(eggs);
        product.add(sauce);

        new Salad(tomato, cucumber, sweetPepper, eggs, sauce);

        collectSalad(product);
        getCalorieSum(product);
        sortedProducts(product);
        filterProducts(product);
    }

}
