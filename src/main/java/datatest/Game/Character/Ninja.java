package datatest.Game.Character;

import datatest.Game.AttackWay;
import datatest.Game.Role;

public class Ninja implements Role {

    private Integer red;
    private Integer blue;
    private String look;
    private AttackWay way;

    {
        red = 50;
        blue = 200;
        look = "Ninja";
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
