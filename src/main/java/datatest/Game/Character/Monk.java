package datatest.Game.Character;

import datatest.Game.AttackWay;
import datatest.Game.Role;

public class Monk extends Role {

    private Integer red;
    private Integer blue;
    private String look;

    {
        red = 300;
        blue = 20;
        look = "Monk";
    }

    @Override
    public Integer getBlue() {
        return blue;
    }

    public String getLook() {
        return look;
    }

    @Override
    public Integer getRed() {
        return red;
    }


}
