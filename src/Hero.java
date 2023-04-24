public class Hero {
    private int Health;
    private int Damage;
    private String superPower;

    public Hero(int health, int damage, String attackType) {
        Health = health;
        Damage = damage;
        superPower = attackType;
    }

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }
}
