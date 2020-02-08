package pl.sda.bigOne.actor;

import pl.sda.bigOne.AbleToAttack;
import pl.sda.bigOne.WeaponType;

public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {

        hp = 100;
        strength = 15;
        weaponType = playerWeapon;
        alive = true;

    }

    @Override
    public int attack() {
        if (weaponType.equals(WeaponType.MACE)){
            hp += 5;
        }
        return strength + weaponType.getDamage() + 1;
    }
}
