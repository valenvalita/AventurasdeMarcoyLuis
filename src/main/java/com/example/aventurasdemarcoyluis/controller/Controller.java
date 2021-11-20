package com.example.aventurasdemarcoyluis.controller;

import com.example.aventurasdemarcoyluis.model.characters.ICharacters;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.characters.enemies.IEnemyType;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Spiny;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marco;
import com.example.aventurasdemarcoyluis.model.items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.items.RedMushroom;
import com.example.aventurasdemarcoyluis.model.items.Star;

import java.util.ArrayList;

/**
 * Game Controller
 * Maintains the necessary parameters to implement the rules and the flow of the game
 */
public class Controller {
    // Lista de Enemigos
    ArrayList<IEnemyType> enemies;

    // Lista de Personajes principales
    ArrayList<ICharacters> mainCharacters;

    // Crear a personajes principales
    /**
     * Create a Marco type character
     * @return a Marco
     */
    public Marco createMarco() {
        Marco aMarco = new Marco(3, 2, 20, 10, 8, 1);
        return aMarco;
    }

    /**
     * Create a Luis type character
     * @return a Luis
     */
    public Luis createLuis() {
        Luis aLuis = new Luis(1, 5, 30, 15, 8, 1);
        return aLuis;
    }
    //Crear a enemigos
    /**
     * Create an enemy list with random enemies
     * @param numberOfEnemies that will add to the list
     * @return an enemy list
     */
    public ArrayList<IEnemyType> createEnemies(int numberOfEnemies) {
        ArrayList<IEnemyType> enemies = new ArrayList<IEnemyType>(numberOfEnemies);
        for(int i = 0; i < numberOfEnemies; i++) {
            // Genera número al azar entre 0 y 2
            int randomNumber = (int) Math.random() * 3;
            if (randomNumber == 0) {
                Boo aBoo = new Boo(1, 3,10, 1);
                enemies.add(aBoo);
            }
            if (randomNumber == 1) {
                Goomba aGoomba = new Goomba(2, 1, 8, 1);
                enemies.add(aGoomba);
            }
            else {
                Spiny aSpiny = new Spiny(4, 1, 6, 1 );
                enemies.add(aSpiny);
            }
        }
        return enemies;
    }

    //Crear Items
    /**
     * create a list of items
     * @param numberOfHS number of Honey Syrup Items
     * @param numberOfRM number of Red Mushroom Items
     * @param numberOfS number of Star Items
     */
    public void createItems(int numberOfHS, int numberOfRM, int numberOfS){
        for (int i=0; i < numberOfHS; i++) {
            HoneySyrup aHoneySyrup = new HoneySyrup();
        }
        for (int i=0; i < numberOfRM; i++) {
            RedMushroom aRedMushroom = new RedMushroom();
        }
        for (int i=0; i < numberOfS; i++) {
            Star aStar = new Star();
        }
    }
    //Crear Baúl de los personajes principales
    Chest chest = new Chest();
    
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
