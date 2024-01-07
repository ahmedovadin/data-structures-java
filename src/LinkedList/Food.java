package LinkedList;

import java.util.LinkedList;

public class Food {
    String receipt;

    public Food(String receipt) {
        this.receipt = receipt;
    }

    public static void main(String[] args) {
        LinkedList<Food> food = new LinkedList<>();
        Food pizza = new Food("Margarita");
        Food pasta = new Food("Boloneze");
        Food burger = new Food("Cheeseburger");
        Food sushi = new Food("Tuna");
        Food beshbarmak = new Food("Noodles with meat");

        food.add(pizza);
        food.add(pasta);
        food.add(burger);
        System.out.println(food);

        food.addFirst(sushi);
        food.addLast(beshbarmak);
        System.out.println(food);
    }

    @Override
    public String toString() {
        return "Food{" +
                "receipt='" + receipt + '\'' +
                '}';
    }
}
