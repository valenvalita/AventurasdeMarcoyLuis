package com.example.aventurasdemarcoyluis;

/**
 * Class that represent an Enemy in the game
 * In this case, a Goomba type Enemy
 * Implements the interface IEnemyType
 * Models the enemy's main characters and methods
 */
public class Goomba extends AbstractEnemies {

    //CONSTRUCTOR
    /**
     * Creates a new Enemy
     *
     * @param NAME
     * @param ATK  attack points
     * @param DEF  defense points
     * @param HP   heal points
     * @param LVL  level of the Unit
     * @param t
     */
    public Goomba(String NAME, int ATK, int DEF, int HP, int LVL, IEnemyType t) {
        super(NAME, ATK, DEF, HP, LVL, t);
    }

    // ATTACK METHODS
    /**
     * Perform an Enemy's attack on a Player
     * Use Double Dispatch technique
     * Sends a message to a Player saying Goomba is attacking him.
     * @param aPlayer receives Enemy's attack
     */
    @Override
    public void atacar(IPlayers aPlayer) {
        aPlayer.atacadoPorGoomba(this);
    }

    /**
     * Determine if two objects are equal
     * @param obj Object to be compared with an object of type Goomba
     * @return true if the objects are the equals (even by the values of their fields)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Goomba)) return false;
        Goomba enemy = (Goomba) obj;
        return this.getAtk()== enemy.getAtk() && this.getDef() == enemy.getDef() && this.getHp() == enemy.getHp() && this.getLvl() == enemy.getLvl();
    }



}
