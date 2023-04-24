public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(400);
        boss.setAttackType("magic");
        System.out.println("Health " + boss.getHealth() + " Demage " + boss.getDamage() + " AttackType " + boss.getAttackType());
    }
}