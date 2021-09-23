package com.example.aventurasdemarcoyluis;

public interface IPlayers {
    public void atacar();

    public void atacadoPor(IEnemyType anEnemy);

    public void receiveHoneySyrup();

    public void receiveRedMushroom();

    public void receiveStar();

    public void addAItem(IItems a);

    /**
     * @return player's attack
     */

    public int getAtk();

    public void setAtk(int atk);

    public int getDef();

    public void setDef(int def);

    public int getMaxHp();

    public void setMaxHp(int hp);

    public int getCurrentHp();

    public void setCurrentHp(int hp);

    public int getFp();

    public void setFp(int fp);

    public int getLvl();

    public void setLvl(int lvl);

    public boolean isKO();


}
