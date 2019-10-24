package datatest.Game.Character;

import datatest.Game.AttackWay;
import datatest.Game.Role;

public class SwordWoman implements Role {

    private Integer red;
    private Integer blue;
    private String look;
    private AttackWay way;

    {
        red = 100;
        blue = 100;
        look = "SwordWoman";
    }

    public Integer getBlue() {
        return blue;
    }

    public String getLook() {
        return look;
    }


    public Integer getRed() {
        return red;
    }

    public void setWay(AttackWay way) {
        this.way = way;
    }

    @Override
    public void attack() {
        way.attack();
    }
}
