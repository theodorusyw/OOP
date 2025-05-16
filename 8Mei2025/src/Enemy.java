public class Enemy implements IDamageable, IAttack {
    private String name;
    private HP hp;
    private int attackPower;
    private int defense;

    public Enemy(String name, HP hp, int attackPower, int defense) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    @Override
    public int takeDamage(int damage, int attackerDefense) {
        int effectiveDamage = damage - defense;
        if (effectiveDamage < 0) effectiveDamage = 0;

        System.out.println(name + " is taking damage for " + effectiveDamage + " point(s)");
        hp.decrease(effectiveDamage);
        return effectiveDamage;
    }

    @Override
    public void attack(IDamageable damageable) {
        System.out.println(name + " attacking " + ((Enemy) damageable).getName());
        damageable.takeDamage(attackPower, defense);
    }

    public void showHP() {
        System.out.println(name + " current HP is " + hp.getValue());
    }
}
