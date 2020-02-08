package pl.sda.bigOne;


import pl.sda.bigOne.actor.Monster;
import pl.sda.bigOne.actor.Player;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Player player = PlayerCreator.createPlayer();
        List<Monster> monsters = MonsterCreationUtil.createMonster();

        while (player.isAlive() && monsters.stream().anyMatch(m -> m.isAlive())) {
            monsters.stream()
                    .filter(m -> m.isAlive())
                    .findFirst()
                    .get()
                    .receiveDamage(player.attack());

            monsters.stream().filter(m -> m.isAlive())
                    .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
            System.out.println(monsters);

        }

    }
}

