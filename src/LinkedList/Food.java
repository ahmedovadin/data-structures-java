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

        System.out.println(food.peekFirst());
        System.out.println(food.peekLast());

        LinkedList<Food> vegetables = new LinkedList<>();
        Food tomato = new Food("Tomato");
        Food potato = new Food("Potato");
        Food cabbage = new Food("Cabbage");
        Food carrot = new Food("Carrot");

        vegetables.add(tomato);
        vegetables.add(potato);
        vegetables.add(cabbage);
        vegetables.add(carrot);

        Food[] foodArray = vegetables.toArray(new Food[4]);
        System.out.println(Arrays.toString(foodArray));

        System.out.println(vegetables.peekFirst());
        System.out.println(vegetables.peekLast());

        System.out.println(vegetables.peekLast());
        System.out.println(vegetables.pollLast());
        System.out.println(vegetables);
    }

    @Override
    public String toString() {
        return "Food{" +
                "receipt='" + receipt + '\'' +
                '}';
    }
}
