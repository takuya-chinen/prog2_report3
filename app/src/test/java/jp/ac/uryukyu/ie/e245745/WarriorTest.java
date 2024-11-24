package jp.ac.uryukyu.ie.e245745;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    /**
     * 上位勇者の特殊攻撃が3回とも150%のダメージになっていることを検証
     * 以下は検証の手順。
     * 1) Warriorクラスの勇者を生成
     * 2) attackWithWeapoSkillを3回実行する
     * 3) 3回とも150％のダメージになっていることを期待
     */
    @Test
    void attackWithWeaponSkillTest() {
        Warrior testHero = new Warrior("テスト勇者", 100, 10);
        Enemy testEnemy = new Enemy("テストモンスター", 45, 5);
        for (int i = 0; i < 3; i++) {
            testHero.attackWithWeaponSkill(testEnemy);
        }
        assertEquals(0, testEnemy.getHitPoint());
    }
}
