import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Spiny;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEnemy {

    private Boo aBoo;
    private Goomba aGoomba;
    private Spiny aSpiny;

    @BeforeEach
    public void setUp() {
        aBoo = new Boo(15,2 , 30, 2);
        aGoomba = new Goomba(1,20 , 75, 2);
        aSpiny = new Spiny(5,10 , 50, 2);
    }

    @Test
    public void constructorTest() {
        // Boo
        assertFalse(aBoo.equals(new Boo(6,2 , 30, 2)));
        assertFalse(aBoo.equals(new Spiny(15,2 , 30, 2)));
        assertTrue(aBoo.equals(new Boo(15,2 , 30, 2)));
        assertEquals(new Boo(15,2 , 30, 2), aBoo);
        // Goomba
        assertFalse(aGoomba.equals(new Goomba(45,33, 56, 5)));
        assertFalse(aGoomba.equals(new Boo(1,20 , 75, 2)));
        assertTrue(aGoomba.equals(new Goomba(1,20 , 75, 2)));
        assertEquals(new Goomba(1,20 , 75, 2), aGoomba);
        // Spiny
        assertFalse(aSpiny.equals(new Spiny(67,77 , 7, 5)));
        assertFalse(aSpiny.equals(new Boo(5,10 , 50, 2)));
        assertTrue(aSpiny.equals(new Spiny(5,10 , 50, 2)));
        assertEquals(new Spiny(5,10 , 50, 2), aSpiny);
    }

    @Test
    public void GetterTest() {
        // Boo
        assertEquals(aBoo.getAtk(),15);
        assertEquals(aBoo.getDef(),2);
        assertEquals(aBoo.getHp(),30);
        assertEquals(aBoo.getLvl(),2);
        // Goomba
        assertEquals(aGoomba.getAtk(),1);
        assertEquals(aGoomba.getDef(),20);
        assertEquals(aGoomba.getHp(),75);
        assertEquals(aGoomba.getLvl(),2);
        // Spiny
        assertEquals(aSpiny.getAtk(),5);
        assertEquals(aSpiny.getDef(),10);
        assertEquals(aSpiny.getHp(),50);
        assertEquals(aSpiny.getLvl(),2);
    }

    @Test
    public void SetterTest() {
        // Boo
        aBoo.setAtk(4);
        assertEquals(aBoo.getAtk(), 4);
        aBoo.setDef(7);
        assertEquals(aBoo.getDef(), 7);
        aBoo.setHp(15);
        assertEquals(aBoo.getHp(), 15);
        aBoo.setLvl(7);
        assertEquals(aBoo.getLvl(), 7);
        // Goomba
        aGoomba.setAtk(82);
        assertEquals(aGoomba.getAtk(), 82);
        aGoomba.setDef(1);
        assertEquals(aGoomba.getDef(), 1);
        aGoomba.setHp(10);
        assertEquals(aGoomba.getHp(), 10);
        aGoomba.setLvl(2);
        assertEquals(aGoomba.getLvl(), 2);
        // Spiny
        aSpiny.setAtk(45);
        assertEquals(aSpiny.getAtk(), 45);
        aSpiny.setDef(18);
        assertEquals(aSpiny.getDef(), 18);
        aSpiny.setHp(21);
        assertEquals(aSpiny.getHp(), 21);
        aSpiny.setLvl(3);
        assertEquals(aSpiny.getLvl(), 3);
    }

    @Test
    public void ReceiveAttackTest() {
        aBoo.setHp(33);
        aBoo.atacadoPor(13);
        assertEquals(aBoo.getHp(),20);
        aBoo.atacadoPor(20);
        assertEquals(aBoo.getHp(),0);
        aGoomba.setHp(7);
        aGoomba.atacadoPor(7);
        assertEquals(aGoomba.getHp(),0);
        aGoomba.atacadoPor(5);
        assertEquals(aGoomba.getHp(),0);
    }
}

