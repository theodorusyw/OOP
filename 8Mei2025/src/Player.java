public class Player implements IAttack {
    private String name;
    private HP hp;
    private int attackPower;
    private int defense;

    public Player(String name, HP hp, int attackPower, int defense) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    @Override
    public void attack(IDamageable damageable) {
        System.out.println(name + " attacking " + ((Enemy) damageable).getName());
        damageable.takeDamage(attackPower, 0);
    }
}
