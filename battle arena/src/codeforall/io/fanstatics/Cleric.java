package codeforall.io.fanstatics;

class Cleric extends Hero {
    public Cleric(String name, int health, int mana) {
        super(name, health, mana);
        addAbility(new Heal());
    }

    @Override
    public void useAbility(int index, Hero target) {
        Ability ability = getAbilities().get(index);
        if (getMana() >= ability.getManaCost() && ability.getCurrentCooldown() == 0) {
            ability.activate(this, this);
            setMana(getMana() - ability.getManaCost());
            ability.startCooldown();
        } else {
            System.out.println(getName() + " does not have enough mana or the ability is on cooldown.");
        }
    }
}