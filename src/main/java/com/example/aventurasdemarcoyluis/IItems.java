package com.example.aventurasdemarcoyluis;

/**
 * Interface that represent the items in the game
 */
public interface IItems {

    //ITEM METHOD
    /**
     * Sends a message to Player saying an Item is used by him
     * @param aPlayer uses a Item
     */
    void usedBy(IPlayers aPlayer);

}
