package codeforall.io.fanstatics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();

        heroes.add(new Mage("Gandalf", 100, 30));
        heroes.add(new Cleric("Mercy", 100, 40));
        heroes.add(new Warrior("Kratos", 100, 30));
        heroes.add(new Rogue("Ezio", 100, 35));
        Arena arena = new Arena(heroes);
        arena.startBattle();
        }
}
