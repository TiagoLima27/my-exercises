package codeforall.io.fanstatics;

class Fireball extends AbstractAbility {
    public Fireball() {
        super("Fireball", 10, 30);
    }

    @Override
    public void activate(Hero user, Hero target) {
        System.out.println(user.getName() + " uses Fireball on " + target.getName() + "!");
        target.takeDamage(getPower());
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