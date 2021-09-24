package com.example.aventurasdemarcoyluis;

/**
 * Class that represent an Item in the game
 * In this case, a Star type Item
 * Implements the interface IItems
 * Models the item's main methods
 */
public class Star implements IItems {

    /**
     * Sends a message to Player saying an Item is used by him
     * The item used is a Star
     * @param aPlayer uses a Item
     */
    @Override
    public void usedBy(IPlayers aPlayer) {
        //Estado Invencible AKA no puede morir(????
        aPlayer.receiveStar();
    }
}
