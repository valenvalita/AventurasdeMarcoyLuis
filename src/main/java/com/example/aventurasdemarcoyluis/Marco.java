package com.example.aventurasdemarcoyluis;

public class Marco extends AbstractPlayers{
    /**
     * Creates a new player
     *
     * @param ATK       attack points
     * @param DEF       defense points
     * @param MaxHP     maximum heal points
     * @param CurrentHP current heal points
     * @param FP        fight points
     * @param LVL       level of the Unit
     */
    public Marco(int ATK, int DEF, int MaxHP, int CurrentHP, int FP, int LVL) {
        super(ATK, DEF, MaxHP, CurrentHP, FP, LVL);
    }

    @Override
    public void atacar() {

    }

    @Override
    public void atacadoPor(IEnemyType anEnemy) {

    }
}
