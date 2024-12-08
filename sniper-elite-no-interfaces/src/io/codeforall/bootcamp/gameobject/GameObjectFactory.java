package io.codeforall.bootcamp.gameobject;

import io.codeforall.bootcamp.Game;
import io.codeforall.bootcamp.gameobject.decor.Tree;
import io.codeforall.bootcamp.gameobject.enemy.ArmouredEnemy;
import io.codeforall.bootcamp.gameobject.enemy.Enemy;
import io.codeforall.bootcamp.gameobject.enemy.SoldierEnemy;
import io.codeforall.bootcamp.gameobject.weapons.SniperRifle;

public class GameObjectFactory {

    public static int ENEMY_HEALTH = 3;
    public static int ARMOUR = 3;
    public static int BARREL_HEALTH = 3;
    public static int HEADSHOT_DAMAGE = ARMOUR + ENEMY_HEALTH;

    public static Enemy createEnemy() {

        return Math.random() > 0.7 ? new SoldierEnemy(ENEMY_HEALTH) : new ArmouredEnemy(ENEMY_HEALTH, ARMOUR);

    }


    public static GameObject barrelOrTree() {

        return Math.random() > 0.3 ? new Barrel(BARREL_HEALTH) : new Tree();
    }

}
