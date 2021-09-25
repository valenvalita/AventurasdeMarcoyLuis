package com.example.aventurasdemarcoyluis;

import java.util.ArrayList;
//import java.util.Objects;

/**
 * Class that represent a Player in the game
 * Implements interface IPlayers
 * Models the player's main characters and methods
 */
public abstract class AbstractPlayers implements IPlayers {
    private int atk;
    private int def;
    private int maxhp;
    private int currenthp;
    private int fp;
    private int lvl;
    private boolean invencible;
    private ArrayList<IItems> armamento;

    // CONSTRUCTOR
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
        this.invencible = false;
        this.armamento = new ArrayList<IItems>(3);
    }

    // ADD ITEMS
    /**
     * Allow the player to have many items
     * @param arma items that can be used by the player
     */
    public void addAItem(IItems arma) {
        armamento.add(arma);
    }

    // GETTERS AND SETTERS
    /**
     * Allows to obtain the player's items
     * @return player's items
     */
    public ArrayList<IItems> getArmamento() {
        return armamento;
    }

    /**
     * Set up a player's items
     * @param armamento player's items
     */
    public void setArmamento(ArrayList<IItems> armamento) {
        this.armamento = armamento;
    }

    /**
     * Allows to obtain the player's attack points
     * @return player's attack points
     */
    public int getAtk() {
        return atk;
    }

    /**
     * Set up a player's attack points
     * If the Player is K.O. he can't attack.
     * @param atk  player's attack points
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * Allows to obtain the player's defense points
     * @return player's defense points
     */
    public int getDef() {
        return def;
    }

    /**
     * Set up a player's defense points
     * @param def player's defense points
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * Allows to obtain a player's maximum health points
     * @return player's maximum health points
     */
    public int getMaxHp() {
        return maxhp;
    }

    /**
     * Set up a player's maximum health points
     * @param hp player's  maximum health points
     */
    public void setMaxHp(int hp) {
        this.maxhp = hp;
    }

    /**
     * Allow to obtain up a player's current health points
     * @return player's  current health points
     */
    public int getCurrentHp() {
        return currenthp;
    }

    /**
     * Set up a player's current health points
     * The player's current health points will always be between 0 and the maximum health points
     * @param hp a player's current health points
     */
    public void setCurrentHp(int hp) {
        if (hp > this.maxhp) {
            this.currenthp = maxhp;
        } else if (hp < 0) {
            this.currenthp = 0;
        } else {
            this.currenthp = hp;
        }
    }

    /**
     * Allow to obtain a player's fight points
     * @return player's fight points
     */
    public int getFp() {
        return fp;
    }

    /**
     * Set up a player's fight points
     * @param fp player's fight points
     */
    public void setFp(int fp) {
        this.fp = fp;
    }

    /**
     * Allow to obtain a player's level
     * @return player's level
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * Set up a player's lvl
     * @param lvl player's lvl
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    /**
     * Allow knowing if player is in invincible state
     * @return player's invincible state
     */
    public boolean getInvencible() {
        return this.invencible;
    }

    /**
     * Set up a player's invincible state
     * @param invinciblestate player's invicible state
     */
    public void setInvencible(boolean invinciblestate) {
        this.invencible = invinciblestate;
    }

    // ITEMS METHODS
    /**
     * Allow the player to receive the item Honey Syrup
     * Restores the Player an amount of 3 fight points
     */
    public void receiveHoneySyrup() {
        //restaura al personaje 3 FP
        int newFP = this.getFp() + 3;
        this.setFp(newFP);
    }

    /**
     * Allow the Player to receive the item Red Mushroom
     * Heals the Player for 10% of MAX HP
     */
    public void receiveRedMushroom() {
        //Cura al personaje una cantidad de 10% del HP MÁXIMO
        int newHP = this.getCurrentHp() + (int)(this.getMaxHp()* 0.1);
        this.setCurrentHp(newHP);
    }

    /**
     * Allow the player to receive the item Star
     */
    public void receiveStar() {
        //Estado Invencible AKA no puede morir(????
        this.setInvencible(true);
    }

    // K.O. METHOD
    /**
     * Allow knowing if the player is defeated
     * @return if the player is K.O.
     */
    public boolean isKO() {
        if (this.getCurrentHp() == 0) {
            this.setAtk(0);
            return true;
        } else {
            return false;
        }
    }

    // RECEIVE ATTACK METHODS
    /**
     * Execute a certain damage attack on a player
     * @param damage Damage dealt to the player
     */
    public void atacadoPor(int damage) {
        int newHp = this.getCurrentHp() - damage;
        this.setCurrentHp(newHp);
    }

    /**
     * Sends a message to Player saying a Boo is attacking him.
     * Gets aBoo attack to calculate the damage received by the Player.
     * Uses atacadoPor method and damage as parameter.
     * @param aBoo executes an attack on a Player.
     */
    @Override
    public void atacadoPorBoo(Boo aBoo) {
        int damage = aBoo.getAtk();
        this.atacadoPor(damage);
    }

    /**
     * Sends a message to Player saying a Goomba is attacking him
     * Gets aGoomba attack to calculate the damage received by the Player.
     * Uses atacadoPor method and damage as parameter.
     * @param aGoomba executes an attack on a Player.
     */
    @Override
    public void atacadoPorGoomba(Goomba aGoomba) {
        int damage = aGoomba.getAtk();
        this.atacadoPor(damage);
    }

    /**
     * Sends a message to Player saying a Spiny is attacking him
     * Gets aSpiny attack to calculate the damage received by the Player.
     * Uses atacadoPor method and damage as parameter.
     * @param aSpiny executes an attack on a Player.
     */
    @Override
    public void atacadoPorSpiny(Spiny aSpiny) {
        int damage = aSpiny.getAtk();
        this.atacadoPor(damage);
    }

}
