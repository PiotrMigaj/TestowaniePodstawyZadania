package pl.migibud.zadaniapodstawyDay3.ex10;

import java.util.Random;

public class Warrior {

    private String name;
    private int strength;
    private int hp;

    public Warrior(String name) {
        this.name = name;
        this.strength = 10;
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public boolean isWarriorDead(int strength) {

        if (strength > 0) {
            return this.hp - strength <= 0;
        }
        return false;
    }

    public void takeAHit(int strength) throws WarriorIsDeadException {
        if (isWarriorDead(strength)) {
            throw new WarriorIsDeadException();
        } else {
            this.hp -= strength;
        }
    }

    public boolean hitEnemy(Warrior enemy, int strength) {

        try {
            enemy.takeAHit(strength);
            return true;
        } catch (WarriorIsDeadException e) {
            System.out.println("You've killed enemy!" + " " + enemy.getName() + " is dead!");
        }
        return false;
    }

    public static void randomFight(Warrior warrior1, Warrior warrior2) {

        Random random = new Random();

        do {
            int[] randomInts = new int[10];
            for (int i = 0; i < 10; i++) {
                randomInts[i] = random.nextInt(3);
            }
            int counter0 = 0;
            int counter1 = 0;
            for (int i = 0; i < 10; i++) {
                if (randomInts[i] == 0) {
                    counter0++;
                }
                if (randomInts[i] == 1) {
                    counter1++;
                }
            }
            if (counter0 > counter1) {
                 if (!warrior1.hitEnemy(warrior2, 10)){
                     break;
                 }
            }
            if (counter0 < counter1) {
                if (!warrior2.hitEnemy(warrior1, 10)){
                    break;
                }
            }
        } while (true);
    }

    public class WarriorIsDeadException extends Exception {

        public WarriorIsDeadException() {
            super("Warrior is dead!");
        }

    }


}
