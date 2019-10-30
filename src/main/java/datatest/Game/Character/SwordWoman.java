package datatest.Game.Character;

import datatest.Game.AttackWay;
import datatest.Game.Role;

public class SwordWoman extends Role {

    private Integer red;
    private Integer blue;
    private String look;

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

}
