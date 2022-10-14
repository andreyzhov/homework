package salad;

import sun.applet.AppletResourceLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrepareSalad {

    public static void main(String[] args) {
        Tomato tomato = new Tomato( "Tomato",15, 3);
        Cucumber cucumber = new Cucumber("Cucumber",13, 3);
        SweetPepper sweetPepper = new SweetPepper( "SweetPepper",10, 2);
        Eggs eggs = new Eggs("Eggs", 25, 5);
        Souce souce = new Souce( "Souce", 45, 1);

        List<Products> product = new ArrayList<>();
        product.add(tomato);
        product.add(cucumber);
        product.add(sweetPepper);
        product.add(eggs);
        product.add(souce);

        product.stream()
                .map(Products::getName)
                .collect(Collectors.toList()).forEach(System.out::println);

        int calorieSum = product.stream()
                .mapToInt(val -> val.calories * val.quantity)
                .sum();

        System.out.println(calorieSum);
    }
}
