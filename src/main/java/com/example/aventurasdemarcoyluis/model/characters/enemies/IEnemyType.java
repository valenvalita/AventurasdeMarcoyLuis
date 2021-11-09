package com.example.aventurasdemarcoyluis.model.characters.enemies;

import com.example.aventurasdemarcoyluis.model.characters.ICharacters;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.IPlayers;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marco;

/**
 * Interface that represent an Enemy in the game
 */
public interface IEnemyType extends ICharacters {

    // K.O. METHOD
    /**
     * Allow knowing if the player is defeated
     * @return if the player is K.O.
     */
    public boolean isKO();

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
