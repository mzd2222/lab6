package datatest.Game.Physical;

import datatest.Game.AttackWay;

public abstract class Physical implements AttackWay {

    private String Way = "Physical Attack";

    public String getWay() {
        return Way;
    }

    public abstract void attack();

}
