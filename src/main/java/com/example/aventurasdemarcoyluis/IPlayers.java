package com.example.aventurasdemarcoyluis;

/**
 * Interface that represent a Player in the game
 */
public interface IPlayers {


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
