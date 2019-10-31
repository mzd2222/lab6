package datatest.Factory;


import datatest.Game.AttackWay;
import datatest.Game.Character.Monk;
import datatest.Game.Character.Ninja;
import datatest.Game.Character.SwordWoman;
import datatest.Game.Role;
import datatest.Game.Way.*;

public class RoleFactory {

    public static Role getRoleByName(String name){

        if (name.equals("monk")){
            return new Monk();
        }

        if (name.equals("ninja")){
            return new Ninja();
        }

        if (name.equals("swordwoman")){
            return new SwordWoman();
        }

        else {
            return null;
        }

    }

    public static AttackWay getAttackWayByName(String name){

        if (name.equals("fireattack")){
            return new FireAttack();
        }

        if (name.equals("goldattack")){
            return new GoldAttack();
        }

        if (name.equals("waterattack")){
            return new WaterAttack();
        }

        if (name.equals("handattack")){
            return new HandAttack();
        }

        if (name.equals("knifeattack")){
            return new Knife();
        }

        if (name.equals("swordattack")){
            return new SwordAttack();
        }

        else {
            return null;
        }
    }

}
