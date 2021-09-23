package com.example.aventurasdemarcoyluis;

public class HoneySyrup implements IItems {

    @Override
    public void usedBy(IPlayers aPlayer) {
        aPlayer.receiveHoneySyrup();
    }

}
