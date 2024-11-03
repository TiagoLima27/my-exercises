package io.codeforall.bootcamp.genie;

/**
 * Class with some common Genie behaviour
 * NOT MEANT to be instantiated
 */
public class Genie {

    private int wishLimit;
    private int grantedWishes;

    /**
     * Genius Constructor
     * @param wishLimit Maximum number of wishes the genius grants
     */
    Genie(int wishLimit) {
        this.wishLimit = wishLimit;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Calculates the number wishes the Genie can still grant
     * @return number of remaining wishes
     */
    public int getRemainingWishes() {
        int remaining = wishLimit - grantedWishes;
        return remaining >= 0 ? remaining : 0;
    }

    /**
     * Verifies if this genie is still willing to grant wishes
     * @return true if genie will still grant wish
     */
    public boolean canGrantWish() {
        return getRemainingWishes() > 0;
    }

    /**
     * Actual wish granting
     */
    private void doGrantWish() {
        this.grantedWishes++;
        System.out.println("Wish granted by " + this.getClass().getSimpleName());
    }

    /**
     * Request a wish from the Genie
     * @return if the wish was granted or not
     */
    public boolean grantWish() {

        if (!canGrantWish()) {
            return false;
        }

        doGrantWish();
        return true;

    };

    /**
     * Obtain the status of the Genie
     * @return the current Genie status
     */
    public String toString() {
        return "Friendly Genie has granted " + getGrantedWishes() + " wishes and still has " + getRemainingWishes() + " wishes to grant.";
    };

}
