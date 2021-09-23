package com.example.aventurasdemarcoyluis;

import java.util.Objects;

/**
 * Class that represent a Enemy in the game
 *
 *  @author SB
 */

public abstract class AbstractEnemies implements IEnemyType {
    private String name;
    private int atk;
    private int def;
    private int hp;
    private int lvl=1;
    private IEnemyType type;

    /**
     * Creates a new Enemy
     * @param NAME name
     * @param ATK attack points
     * @param DEF defense points
     * @param HP  heal points
     * @param LVL level of the Unit
     *
     */
    public AbstractEnemies(String NAME, int ATK, int DEF, int HP, int LVL, IEnemyType t) {
        name = NAME;
        atk = ATK;
        def = DEF;
        hp = HP;
        lvl = LVL;
        type = t;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enemies)) return false;
        Enemies enemies = (Enemies) o;
        return atk == enemies.atk && def == enemies.def && hp == enemies.hp && lvl == enemies.lvl;
    }
    */


}
