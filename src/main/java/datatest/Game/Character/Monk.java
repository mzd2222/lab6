package datatest.Game.Character;

import datatest.Game.AttackWay;
import datatest.Game.Role;

public class Monk implements Role {

    private Integer red;
    private Integer blue;
    private String look;
    private AttackWay way;

    {
        red = 300;
        blue = 20;
        look = "Monk";
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

    @Override
    public void setWay(AttackWay way) {
        this.way = way;
    }

    @Override
    public void attack() {
        way.attack();
    }
}
