package codeforall.io.fanstatics;

class SneakAttack extends AbstractAbility {
    public SneakAttack() {
        super("Sneak Attack", 15, 30);
    }

    @Override
    public void activate(Hero user, Hero target) {
        System.out.println(user.getName() + " uses Sneak Attack on " + target.getName() + "!");
        target.takeDamage(getPower() * 3);
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
