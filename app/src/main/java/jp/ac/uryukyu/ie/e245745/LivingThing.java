package jp.ac.uryukyu.ie.e245745;

/**
 * 生物のクラス。
 * String name; //生物の名前
 * int hitPoint; //生物のHP
 * int attack; //生物の攻撃力
 * boolean dead; //生物の生死状態。true=死亡。
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、体力、攻撃力を指定する。
     * 
     * @param name     生物名
     * @param hitPoint 体力
     * @param attack   攻撃力
     */
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }

    /**
     * deadフィールドのアクセサメソッド。
     * 
     * @return dead 生死状態
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * deadフィールドのセッターメソッド。
     * 
     * @param dead 生死状態
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    /**
     * nameフィールドのアクセサメソッド。
     * 
     * @return name 名前
     */
    public String getName() {
        return this.name;
    }

    /**
     * hitPointフィールドのアクセサメソッド。
     * 
     * @return hitPoint 体力
     */
    public int getHitPoint() {
        return this.hitPoint;
    }

    /**
     * hitPointフィールドのセッターメソッド。
     * 
     * @param hitPoint 体力
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * opponentへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * 
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if (!dead) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        this.hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
