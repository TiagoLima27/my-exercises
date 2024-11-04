package codeforall.io.fanstatics;

class Heal extends AbstractAbility {
    public Heal() {
        super("Heal", 20, 50);
    }

    @Override
    public void activate(Hero user, Hero target) {
        System.out.println(user.getName() + " uses Heal on " + target.getName() + "!");
        target.setHealth(target.getHealth() + getPower());
    }

    @Override
    public void startCooldown() {
        this.currentCooldown = getCooldown();
    }

    @Override
    public void reduceCooldown() {
        if (currentCooldown > 0) {
            currentCooldown--;
        }
    }
}