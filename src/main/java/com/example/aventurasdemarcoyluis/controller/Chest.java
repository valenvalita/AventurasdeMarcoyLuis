package com.example.aventurasdemarcoyluis.controller;

import com.example.aventurasdemarcoyluis.model.items.IItems;

import java.util.Hashtable;

/**
 * Implements the chest of items
 */
public class Chest {
    public Hashtable <String, Integer> chest;

    /**
     * Create a chest empty
     */
    public void createChest() {
        chest = new Hashtable <String, Integer>();
    }

    /**
     * Add items to the chest
     * @param aName Name of the item
     * @param NumberofItem quantity of the item
     */
    public void addItemToChest(String aName, int NumberofItem) {
        chest.put(aName, NumberofItem);
    }

    /**
     * Get an item from the chest
     * @param aName name of the item
     */
    public void getIteminChest(String aName) {
        chest.get(aName);
    }
}
