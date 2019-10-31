package datatest.Game.Character;

import datatest.Game.AttackWay;
import datatest.Game.Role;

public class Ninja extends Role {

    private Integer red;
    private Integer blue;
    private String look;

    {
        red = 50;
        blue = 200;
        look = "Ninja";
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
