package datatest.Game.Majic;

import datatest.Game.AttackWay;

public abstract class Magic implements AttackWay {

    private String Way = "Magic Attack";

    public String getWay() {
        return Way;
    }

    public abstract void attack();

}
