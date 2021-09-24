package com.example.aventurasdemarcoyluis;

/**
 * Class that represent a Player in the game
 * In this case, a Luis type Player
 * Implements interface IPlayers
 * Models the player's main characters and methods
 */
public class Luis extends AbstractPlayers {

    // CONSTRUCTOR
    /**
     * Creates a new player of type Luis
     *
     * @param ATK       attack points
     * @param DEF       defense points
     * @param MaxHP     maximum heal points
     * @param CurrentHP current heal points
     * @param FP        fight points
     * @param LVL       level of the Unit
     */
    public Luis(int ATK, int DEF, int MaxHP, int CurrentHP, int FP, int LVL) {
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
     * Sends a message to an Enemy saying Luis is attacking him.
     * @param anEnemy receives Player's attack
     */
    @Override
    public void atacar(IEnemyType anEnemy) {
        anEnemy.atacadoPorLuis(this);
    }

}
