package com.example.aventurasdemarcoyluis;

public class Star implements IItems {
    private AbstractPlayers aPlayer;

    @Override
    public void usedBy(IPlayers aPlayer) {
        //Estado Invencible AKA no puede morir(????
        aPlayer.receiveStar();

    }
}
