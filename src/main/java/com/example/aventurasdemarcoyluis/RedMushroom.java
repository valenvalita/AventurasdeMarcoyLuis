package com.example.aventurasdemarcoyluis;

/**
 * Class that represent an Item in the game
 * In this case, a Red Mushroom type Item
 * Implements the interface IItems
 * Models the item's main methods
 */
public class RedMushroom implements IItems {

    /**
     * Sends a message to Player saying an Item is used by him
     * The item used is a Red Mushroom
     * @param aPlayer uses a Item
     */
    @Override
    public void usedBy(IPlayers aPlayer) {
        aPlayer.receiveRedMushroom();
    }

}
