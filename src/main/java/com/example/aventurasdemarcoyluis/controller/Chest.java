package com.example.aventurasdemarcoyluis.controller;

import com.example.aventurasdemarcoyluis.model.items.IItems;

import java.util.Hashtable;

/**
 * Implements the chest of items
 */
public class Chest {
    public Hashtable <String, Integer> chest;

    /**
     * Create a empty chest
     */
    public Chest() {
        chest = new Hashtable <String, Integer>();
    }

    /**
     * Add items to the chest
     * @param aName Name of the item
     * @param numberOfItem quantity of the item
     */
    public void addItemToChest(String aName, int numberOfItem) {
        chest.put(aName, numberOfItem);
    }

    /**
     * Get number of item from the chest
     * @param aName name of the item
     */
    public int getItemInChest(String aName) {
        return chest.get(aName);
    }
}
