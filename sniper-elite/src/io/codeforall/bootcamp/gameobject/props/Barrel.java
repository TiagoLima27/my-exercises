package io.codeforall.bootcamp.gameobject.props;

import io.codeforall.bootcamp.gameobject.Destroyable;
import io.codeforall.bootcamp.gameobject.GameObject;

/**
 * A barrel game object, capable of being shot at
 */
public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;

    public Barrel() {

        int index = (int) (Math.random() * (BarrelType.values().length));
        barrelType = BarrelType.values()[index];

    }

    @Override
    public boolean isDestroyed() {
        return currentDamage >= barrelType.getMaxDamage();
    }

    /**
     * @see Destroyable#hit(int)
     */
    @Override
    public void hit(int damage) {
        currentDamage++;
    }

    /**
     * @see GameObject#getMessage()
     */
    @Override
    public String getMessage() {
        return "Barrel found. Let's blow it!";
    }
}
