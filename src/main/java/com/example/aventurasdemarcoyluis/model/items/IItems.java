package com.example.aventurasdemarcoyluis.model.items;

import com.example.aventurasdemarcoyluis.model.characters.principal_characters.IPlayers;

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
