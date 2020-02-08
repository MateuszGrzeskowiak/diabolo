package pl.sda.bigOne;


import pl.sda.bigOne.actor.Monster;
import pl.sda.bigOne.actor.Player;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player player = PlayerCreator.createPlayer();
        List<Monster> monsters = MonsterCreationUtil.createMonster();


        monsters.get(0).receiveDamage(player.attack());
        monsters.stream().filter(m -> m.isAlive())
                .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
        System.out.println(monsters);
    }
}

