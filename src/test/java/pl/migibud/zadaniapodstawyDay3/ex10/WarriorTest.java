package pl.migibud.zadaniapodstawyDay3.ex10;

import org.junit.jupiter.api.Test;
import pl.migibud.zadaniapodstawyDay3.ex10.Warrior;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void shouldWarriorNotBeNullAfterCreateInstance(){

        //given
        Warrior warrior = new Warrior("Piotr");

        //then
        assertNotNull(warrior);
    }

    @Test
    void shouldWarriorBeDeadAfterReachingHPLessEqualZero(){

        //given
        Warrior warrior = new Warrior("Piotr");

        //then
        boolean check = warrior.isWarriorDead(100);

        //then
        assertTrue(check);
    }

    @Test
    void shouldWarriorNotBeDeadIfPunchSrtengthIsLessEualZero(){

        //given
        Warrior warrior = new Warrior("Piotr");

        //then
        boolean check = warrior.isWarriorDead(1);

        //then
        assertFalse(check);
    }


    @Test
    void isWarriorDeadAfterTakingFatalHit() {

        //given
        Warrior warrior = new Warrior("Piotr");

        //then
        assertThrows(Warrior.WarriorIsDeadException.class,()->warrior.takeAHit(100));

    }

    @Test
    void shouldOtherWarriorBeKilled(){
        //given
        Warrior warrior1 = new Warrior("Piotr1");
        Warrior warrior2 = new Warrior("Piotr2");

        //when
        int hpOfEnemyBeforeHit = warrior2.getHp();
        warrior1.hitEnemy(warrior2,100);
        boolean check = hpOfEnemyBeforeHit==warrior2.getHp();

        //then
        assertTrue(check);
    }

    @Test
    void shouldOtherWarriorNotBeKilled(){
        //given
        Warrior warrior1 = new Warrior("Piotr1");
        Warrior warrior2 = new Warrior("Piotr2");

        //when
        int hpOfEnemyBeforeHit = warrior2.getHp();
        warrior1.hitEnemy(warrior2,99);
        boolean check = hpOfEnemyBeforeHit==warrior2.getHp();

        //then
        assertFalse(check);
        assertEquals(1,warrior2.getHp());
    }
}