package jp.ac.uryukyu.ie.e245745;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent) {
        int damage = (int) (1.5 * getAttack());
        if (!isDead()) {
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
