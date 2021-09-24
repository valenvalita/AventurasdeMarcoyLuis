package com.example.aventurasdemarcoyluis;

/**
 * Class that represent an Enemy in the game
 * Implements the interface IEnemyType
 * Models the enemy's main characters and methods
 */
public abstract class AbstractEnemies implements IEnemyType {
    private int atk;
    private int def;
    private int hp;
    private int lvl=1;
    private IEnemyType type;

    /**
     * Creates a new Enemy
     * @param ATK attack points
     * @param DEF defense points
     * @param HP  heal points
     * @param LVL level of the Unit
     */
    public AbstractEnemies(String NAME, int ATK, int DEF, int HP, int LVL, IEnemyType t) {
        atk = ATK;
        def = DEF;
        hp = HP;
        lvl = LVL;
        type = t;
    }

    // GETTERS AND SETTERS
    /**
     * Allows to obtain the enemy's attack points
     * @return enemy's attack points
     */
    public int getAtk() {
        return atk;
    }

    /**
     * Set up an enemy's attack points
     * If the Enemy is K.O. he can't attack.
     * @param atk  enemy's attack points
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * Allows to obtain the enemy's defense points
     * @return enemy's defense points
     */
    public int getDef() {
        return def;
    }

    /**
     * Set up a enemy's defense points
     * @param def enemy's defense points
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * Allows to obtain a enemy's health points
     * @return enemy's health points
     */
    public int getHp() {
        return hp;
    }

    /**
     * Set up a enemy's health points
     * @param hp enemy's health points
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Allow to obtain an enemy's level
     * @return enemy's level
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * Set up an enemy's lvl
     * @param lvl enemy's lvl
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    // RECEIVE ATTACK METHODS
    /**
     * Execute a certain damage attack on an enemy
     * @param damage Damage dealt to the enemy
     */
    public void atacadoPor(int damage) {
        int newHp = this.getHp() - damage;
        this.setHp(newHp);
    }

    /**
     * Sends a message to Enemy saying a Marco is attacking him.
     * Gets aMarco attack to calculate the damage received by the Enemy.
     * Uses atacadoPor method and damage as parameter.
     * @param aMarco executes an attack on an Enemy.
     */
    @Override
    public void atacadoPorMarco(Marco aMarco) {
        int damage = aMarco.getAtk();
        this.atacadoPor(damage);
    }

    /**
     * Sends a message to Enemy saying a Luis is attacking him.
     * Gets aLuis attack to calculate the damage received by the Enemy.
     * Uses atacadoPor method and damage as parameter.
     * @param aLuis executes an attack on an Enemy.
     */
    @Override
    public void atacadoPorLuis(Luis aLuis) {
        int damage = aLuis.getAtk();
        this.atacadoPor(damage);
    }

}
