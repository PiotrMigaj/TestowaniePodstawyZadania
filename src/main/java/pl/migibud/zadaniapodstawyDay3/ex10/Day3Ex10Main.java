package pl.migibud.zadaniapodstawyDay3.ex10;

import java.util.Random;

public class Day3Ex10Main {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("Piotr 1");
        Warrior warrior2 = new Warrior("Piotr 2");

        Warrior.randomFight(warrior1,warrior2);

    }

}
