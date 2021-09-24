package com.example.aventurasdemarcoyluis;

/**
 * Interface that represent an Enemy in the game
 */
public interface IEnemyType {

    // ATTACK METHOD
    /**
     * Perform an Enemy's attack on a Player
     * @param aPlayer receives Enemy's attack
     */
    public void atacar(IPlayers aPlayer);

    // RECEIVE ATTACK METHODS
    /**
     * Sends a message to Enemy saying a Player of type Luis is attacking him
     * @param aLuis executes an attack on an Enemy.
     */
    public void atacadoPorLuis(Luis aLuis);

    /**
     * Sends a message to Enemy saying a Player of type Marco is attacking him
     * @param aMarco executes an attack on an Enemy.
     */
    public void atacadoPorMarco(Marco aMarco);


}
