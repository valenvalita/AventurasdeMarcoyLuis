package com.example.aventurasdemarcoyluis.model.characters.principal_characters;

import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.IEnemyType;
import com.example.aventurasdemarcoyluis.model.items.IItems;

/**
 * Class that represent a Player in the game
 * In this case, a Marco type Player
 * Implements interface IPlayers
 * Models the player's main characters and methods
 */
public class Marco extends AbstractPlayers {

    // CONSTRUCTOR
    /**
     * Creates a new player of type Marco
     *
     * @param ATK       attack points
     * @param DEF       defense points
     * @param MaxHP     maximum heal points
     * @param CurrentHP current heal points
     * @param FP        fight points
     * @param LVL       level of the Unit
     */
    public Marco(int ATK, int DEF, int MaxHP, int CurrentHP, int FP, int LVL) {
        super(ATK, DEF, MaxHP, CurrentHP, FP, LVL);
    }

    // ITEM METHOD
    /**
     * Executes a player's ability to use an item
     * Sends a message to anItem saying a Player is using it.
     * @param anItem Item used by the Player
     */
    public void useItem(IItems anItem) {
        anItem.usedBy(this);
    }

    // ATTACK METHODS
    /**
     * Perform a Player's attack on an Enemy
     * Use Double Dispatch technique
     * Sends a message to an Enemy saying Marco is attacking him.
     * @param anEnemy receives Player's attack
     */
    @Override
    public void atacar(IEnemyType anEnemy) {
        anEnemy.atacadoPorMarco(this);
    }

    /**
     * Sends a message to Player saying a Boo is attacking him.
     * Gets aBoo attack to calculate the damage received by the Player.
     * In this case, the damage equals to 0. aBoo only attacks a PLayer of type Luis.
     * Uses atacadoPor method and damage as parameter.
     * @param aBoo executes an attack on a Player.
     */
    @Override
    public void atacadoPorBoo(Boo aBoo) {
        this.atacadoPor(0);
    }

    /**
     * Determine if two objects are equal
     * @param obj Object to be compared with an object of type Marco
     * @return true if the objects are the equals (even by the values of their fields)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Marco)) return false;
        Marco player = (Marco) obj;
        return this.getAtk()== player.getAtk() && this.getDef() == player.getDef() && this.getMaxHp() == player.getMaxHp() && this.getCurrentHp() == player.getCurrentHp() && this.getLvl() == player.getLvl();
    }

    //@Override
    //public int hashCode() { return super.hashCode(); }
}
