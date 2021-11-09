package com.example.aventurasdemarcoyluis.model.characters.principal_characters;

import com.example.aventurasdemarcoyluis.model.characters.ICharacters;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.characters.enemies.IEnemyType;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Spiny;
import com.example.aventurasdemarcoyluis.model.items.IItems;

/**
 * Interface that represent a Player (Principal character) in the game
 */
public interface IPlayers extends ICharacters {

    // K.O. METHOD
    /**
     * Allow knowing if the player is defeated
     * @return if the player is K.O.
     */
    public boolean isKO();

    // ATTACK METHOD
    /**
     * Perform a Player's attack on an Enemy
     * @param anEnemy receives Player's attack
     */
    public void atacar(IEnemyType anEnemy);

    // RECEIVE ATTACK METHODS
    /**
     * Sends a message to Player saying a Boo is attacking him
     * @param aBoo executes an attack on a Player.
     */
    public void atacadoPorBoo(Boo aBoo);

    /**
     * Sends a message to Player saying a Goomba is attacking him
     * @param aGoomba executes an attack on a Player.
     */
    public void atacadoPorGoomba(Goomba aGoomba);

    /**
     * Sends a message to Player saying a Spiny is attacking him
     * @param aSpiny executes an attack on a Player.
     */
    public void atacadoPorSpiny(Spiny aSpiny);

    // ITEMS METHODS
    /**
     * Executes a player's ability to use an item
     * @param anItem Item used by the Player
     */
    public void useItem(IItems anItem);

    /**
     * Allow the player to receive the item Honey Syrup
     */
    public void receiveHoneySyrup();

    /**
     * Allow the player to receive the item Red Mushroom
     */
    public void receiveRedMushroom();

    /**
     * Allow the player to receive the item Honey Syrup
     */
    public void receiveStar();

    // ADD ITEMS
    /**
     * Allow the player to have many items
     * @param arma items that can be used by the player
     */
    public void addAItem(IItems arma);


}
