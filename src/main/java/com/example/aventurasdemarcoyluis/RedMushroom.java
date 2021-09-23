package com.example.aventurasdemarcoyluis;

public class RedMushroom implements IItems {
    private AbstractPlayers aPlayer;

    @Override
    public void usedBy(IPlayers aPlayer) {
        aPlayer.receiveRedMushroom();
    }

}
