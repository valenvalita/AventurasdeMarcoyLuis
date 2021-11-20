package com.example.aventurasdemarcoyluis.controller;

import com.example.aventurasdemarcoyluis.model.characters.ICharacters;
import com.example.aventurasdemarcoyluis.model.characters.enemies.IEnemyType;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.IPlayers;

import java.util.ArrayList;

public class BattleRound {
    ArrayList <IEnemyType> enemiesList;
    ArrayList <IPlayers> mainCharactersList;
    ArrayList <ICharacters> charactersOnBattleList = new ArrayList<ICharacters>();
    Chest chest;

    public BattleRound(ArrayList<IEnemyType> anEnemiesList, ArrayList<IPlayers> aMainCharactersList, Chest aChest) {
        this.enemiesList = anEnemiesList;
        this.mainCharactersList = aMainCharactersList;
        this.charactersOnBattleList = new ArrayList<ICharacters>();
        this.chest = aChest;
    }

    public void setCharactersOnBattle() {
        this.charactersOnBattleList.addAll(this.mainCharactersList);
        this.charactersOnBattleList.addAll(this.enemiesList);
    }

    public void eliminateCharacterOnBattle(ICharacters aCharacter) {
        this.charactersOnBattleList.remove(aCharacter);
    }

    public ArrayList <ICharacters> getCharactersOnBattle() {
        return this.getCharactersOnBattle();
    }

    public Chest getChest() {
        return this.chest;
    }

    // Implementar los turnos
    //Que un jugador pueda utilizar un elemento del baúl
    //Obtener los elementos del baúl
    //Obtener todos los personajes del turno
    //Quitar a un personaje del turno
    //Quitar a un personaje del turno cuando está KO
    //Saber cuando los personajes principales ganan o pierden
    //Obtener el personaje que posee el turno actual
    //Obtener el personaje del sgt turno
    //Terminar el turno del jugador actual
}
