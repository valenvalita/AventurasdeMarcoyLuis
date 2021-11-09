package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.principal_characters.IPlayers;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;

/**
 * Class that represent an Enemy in the game
 * In this case, a Boo type Enemy
 * Implements the interface IEnemyType
 * Models the enemy's main characters and methods
 */
public class Boo extends AbstractEnemies {

    //CONSTRUCTOR
    /**
     * Creates a new Enemy
     *
     * @param ATK  attack points
     * @param DEF  defense points
     * @param HP   heal points
     * @param LVL  level of the Unit
     */
    public Boo(int ATK, int DEF, int HP, int LVL) {
        super(ATK, DEF, HP, LVL);
    }

    // ATTACK METHODS

    /**
     * Perform an Enemy's attack on a Player
     * Use Double Dispatch technique
     * Sends a message to a Player saying Boo is attacking him.
     * @param aPlayer receives Enemy's attack
     */
    @Override
    public void atacar(IPlayers aPlayer) {
        aPlayer.atacadoPorBoo(this);
    }

    /**
     * Sends a message to Boo saying a Luis is attacking him.
     * Gets aLuis attack to calculate the damage received by the Enemy.
     * In this case, the damage equals to 0. Boo can only be attack by Player of type Marco.
     * Uses atacadoPor method and damage as parameter.
     * @param aLuis executes an attack on a Boo.
     */
    @Override
    public void atacadoPorLuis(Luis aLuis) {
        this.atacadoPor(0);
    }

    /**
     * Determine if two objects are equal
     * @param obj Object to be compared with an object of type Boo
     * @return true if the objects are the equals (even by the values of their fields)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Boo)) return false;
        Boo enemy = (Boo) obj;
        return this.getAtk()== enemy.getAtk() && this.getDef() == enemy.getDef() && this.getHp() == enemy.getHp() && this.getLvl() == enemy.getLvl();
    }

    //@Override
    //public int hashCode() {return super.hashCode();}

}
