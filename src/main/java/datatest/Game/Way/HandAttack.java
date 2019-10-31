package datatest.Game.Way;

import datatest.Game.Physical.Physical;

public class HandAttack extends Physical {

    private Integer useBlue = 0;
    private Integer damage_num = 0;
    private Integer self_damage_num = 0;

    @Override
    public void attack() {
        System.out.println("我在进行手攻击");
    }

}
