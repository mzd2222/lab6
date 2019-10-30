package datatest.Game;

public abstract class Role {

    private AttackWay way;

    public void setWay(AttackWay way){
        this.way = way;
    }

    public void attack() {
        way.attack();
    }

}
