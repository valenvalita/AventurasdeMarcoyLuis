package com.example.aventurasdemarcoyluis;

import java.util.List;

/**
 * Class that represent a Player in the game
 *
 * @author SB
 */
public abstract class AbstractPlayers implements IPlayers {
    private int atk;
    private int def;
    private int maxhp;
    private int currenthp;
    private int fp;
    private int lvl = 1;
    public List<IItems> armamento;

    /**
     * Creates a new player
     *
     * @param ATK       attack points
     * @param DEF       defense points
     * @param MaxHP     maximum heal points
     * @param CurrentHP current heal points
     * @param FP        fight points
     * @param LVL       level of the Unit
     */
    public AbstractPlayers(int ATK, int DEF, int MaxHP, int CurrentHP, int FP, int LVL) {
        this.atk = ATK;
        this.def = DEF;
        this.maxhp = MaxHP;
        this.currenthp = CurrentHP;
        this.fp = FP;
        this.lvl = LVL;
    }

    public void addAItem(IItems a) {
        armamento.add(a);
    }

    /**
     * @return player's attack
     */

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

    public int getMaxHp() {
        return maxhp;
    }

    public void setMaxHp(int hp) {
        this.maxhp = hp;
    }

    public int getCurrentHp() {
        return currenthp;
    }

    public void setCurrentHp(int hp) {
        if (hp > this.maxhp) {
            this.currenthp = maxhp;
        } else if (hp < 0) {
            this.currenthp = 0;
        }
        this.currenthp = hp;
    }

    public int getFp() {
        return fp;
    }

    public void setFp(int fp) {
        this.fp = fp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


    public void receiveRedMushroom() {
        //Cura al personaje una cantidad de 10% del HP MÁXIMO
        int newHP = (int) (this.getMaxHp() * 1.1);
        this.setCurrentHp(newHP);
    }

    public void receiveStar() {
    }

    public void receiveHoneySyrup() {
        //aPlayer.usarMiel();
        //restaura al personaje 3 FP
        int newFP = this.getFp() + 3;
        this.setFp(newFP);
    }
}
