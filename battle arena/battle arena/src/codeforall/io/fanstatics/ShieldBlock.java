package codeforall.io.fanstatics;

class ShieldBlock extends AbstractAbility {
    public ShieldBlock() {
        super("Shield Block", 15, 10);
    }

    @Override
    public void activate(Hero user, Hero target) {
        System.out.println(user.getName() + " uses Shield Block!");

        user.normalAttack(target);
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