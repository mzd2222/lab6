package datatest.Game.Way;

import datatest.Game.Majic.Magic;

public class FireAttack extends Magic {

    private Integer useBlue = 0;
    private Integer damage_num = 0;
    private Integer self_damage_num = 0;

    @Override
    public void attack() {
        System.out.println("我在进行火系攻击");
    }
}