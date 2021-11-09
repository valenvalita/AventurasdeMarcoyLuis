package com.example.aventurasdemarcoyluis.model.characters;

import com.example.aventurasdemarcoyluis.model.characters.ICharacters;
import com.example.aventurasdemarcoyluis.model.items.IItems;

/**
 * Abstract Class that represent a Character in the game
 * Implements interface ICharacters
 * Models the principal characters and enemies and their methods
 */
public class AbstractCharacters implements ICharacters {
    private int atk;
    private int def;
    private int maxhp;
    private int currenthp;
    private int lvl;

    // CONSTRUCTOR
    /**
     * Creates a new character
     *
     * @param ATK       attack points
     * @param DEF       defense points
     * @param MaxHP     maximum heal points
     * @param CurrentHP current heal points
     * @param LVL       level of the Unit
     */
    public AbstractCharacters(int ATK, int DEF, int MaxHP, int CurrentHP, int LVL) {
        this.atk = ATK;
        this.def = DEF;
        this.maxhp = MaxHP;
        this.currenthp = CurrentHP;
        this.lvl = LVL;
    }

    //GETTERS AND SETTERS
    /**
     * Allow to obtain up a character's current health points
     * @return character's  current health points
     */
    public int getCurrentHp() {
        return currenthp;
    }

    // K.O. METHOD
    /**
     * Allow knowing if the character is defeated
     * @return if the player is K.O.
     */

    public final boolean isKO() {
        return this.getCurrentHp() == 0;
    }

}
