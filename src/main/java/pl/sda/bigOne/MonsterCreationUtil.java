package pl.sda.bigOne;

import pl.sda.bigOne.actor.Ghul;
import pl.sda.bigOne.actor.Goblin;
import pl.sda.bigOne.actor.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterCreationUtil {

    public static List<Monster> createMonster() {
        int howManyMonsters = new Random().nextInt(4);
        List<Monster> monsters = new ArrayList<>();
        for (int i = 0; i < howManyMonsters; i++) {
            int monsterType = new Random().nextInt(2);
            if (monsterType == 0){
                monsters.add(new Goblin());
            }else {
                monsters.add(new Ghul());
            }
        }
        return monsters;
    }
}
