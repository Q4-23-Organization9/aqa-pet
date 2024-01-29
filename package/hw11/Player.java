package hw11;

import java.util.Scanner;
public class Player {

    private String name;
    private Select select;

    public Player(String name) {
        this.name = name;
    }

    public void makeSelect() {
        System.out.println(name + ", enter your choice (ROCK, SCISSORS, PAPER): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        try {
            select = Select.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect choice. Please try again.");
            makeSelect();
        }

    }

    public Select getSelect() {
        return select;
    }

    public String getName() {
        return name;
    }

}
