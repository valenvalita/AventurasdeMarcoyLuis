import com.example.aventurasdemarcoyluis.model.items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marco;
import com.example.aventurasdemarcoyluis.model.items.RedMushroom;
import com.example.aventurasdemarcoyluis.model.items.Star;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPlayer {
    private Luis aLuis;
    private Marco aMarco;
    private RedMushroom aRedMushroom;
    private HoneySyrup aHoneySyrup;
    private Star aStar;

    @BeforeEach
    public void setUp() {
        aLuis = new Luis (3,4,20,20,5,3);
        aMarco = new Marco (2,3,20,10, 4,2);
        aRedMushroom = new RedMushroom ();
        aHoneySyrup = new HoneySyrup ();
        aStar = new Star ();
    }

    @Test
    public void constructorTest() {
        // Luis
        assertFalse(aLuis.equals(new Marco (3,4,20,20,5,3)));
        assertFalse(aLuis.equals(new Luis (70,80,100,20,5,3)));
        assertTrue(aLuis.equals(new Luis (3,4,20,20,5,3)));
        assertEquals(new Luis (3,4,20,20,5,3), aLuis);
        // Marco
        assertFalse(aMarco.equals(new Luis (2,3,20,10, 4,2)));
        assertFalse(aMarco.equals(new Marco (1,6,1,1, 1,7)));
        assertTrue(aMarco.equals(new Marco (2,3,20,10, 4,2)));
        assertEquals(new Marco (2,3,20,10, 4,2), aMarco);
    }

    @Test
    public void GetterTest() {
        // Luis
        assertEquals(aLuis.getAtk(),3);
        assertEquals(aLuis.getDef(),4);
        assertEquals(aLuis.getMaxHp(),20);
        assertEquals(aLuis.getCurrentHp(),20);
        assertEquals(aLuis.getFp(),5);
        assertEquals(aLuis.getLvl(),3);
        // Marco
        assertEquals(aMarco.getAtk(),2);
        assertEquals(aMarco.getDef(),3);
        assertEquals(aMarco.getMaxHp(),20);
        assertEquals(aMarco.getCurrentHp(),10);
        assertEquals(aMarco.getFp(),4);
        assertEquals(aMarco.getLvl(),2);
    }

    @Test
    public void SetterTest() {
        // Luis
        aLuis.setAtk(5);
        assertEquals(aLuis.getAtk(),5);
        aLuis.setDef(20);
        assertEquals(aLuis.getDef(),20);
        aLuis.setMaxHp(25);
        assertEquals(aLuis.getMaxHp(),25);
        aLuis.setCurrentHp(0);
        assertEquals(aLuis.getCurrentHp(),0);
        aLuis.setFp(3);
        assertEquals(aLuis.getFp(),3);
        aLuis.setLvl(4);
        assertEquals(aLuis.getLvl(),4);
        // Marco
        aMarco.setAtk(39);
        assertEquals(aMarco.getAtk(),39);
        aMarco.setDef(7);
        assertEquals(aMarco.getDef(),7);
        aMarco.setMaxHp(16);
        assertEquals(aMarco.getMaxHp(),16);
        aMarco.setCurrentHp(20);
        assertEquals(aMarco.getCurrentHp(),16);
        aMarco.setFp(1);
        assertEquals(aMarco.getFp(),1);
        aMarco.setLvl(5);
        assertEquals(aMarco.getLvl(),5);
    }

    @Test
    public void ItemsTest() {
        // Honey Syrup
        aLuis.receiveHoneySyrup();
        assertEquals(aLuis.getFp(),8);
        aLuis.useItem(aHoneySyrup);
        assertEquals(aLuis.getFp(),11);
        // Red Mushroom
        aMarco.receiveRedMushroom();
        assertEquals(aMarco.getCurrentHp(),12);
        aMarco.useItem(aRedMushroom);
        assertEquals(aMarco.getCurrentHp(),14);
        // Star
        assertFalse(aLuis.getInvencible());
        aLuis.receiveStar();
        assertTrue(aLuis.getInvencible());
        aMarco.useItem(aStar);
        assertTrue(aMarco.getInvencible());
    }

    @Test
    public void AddItemsTest() {
        aLuis.addAItem(aHoneySyrup);
        assertEquals(aLuis.getArmamento().size(),1);
        aLuis.addAItem(aRedMushroom);
        assertEquals(aLuis.getArmamento().size(),2);
        aMarco.addAItem(aHoneySyrup);
        assertEquals(aMarco.getArmamento().size(),1);
    }

    @Test
    public void KOTest() {
        aLuis.setCurrentHp(5);
        assertFalse(aLuis.isKO());
        aLuis.setCurrentHp(0);
        assertEquals(aLuis.getCurrentHp(),0);
        assertTrue(aLuis.isKO());
        // assertEquals(aLuis.getAtk(), 0);
    }

    @Test
    public void ReceiveAttackTest() {
        aMarco.setCurrentHp(10);
        aMarco.atacadoPor(6);
        assertEquals(aMarco.getCurrentHp(),4);
        aMarco.atacadoPor(4);
        assertEquals(aMarco.getCurrentHp(),0);
        assertTrue(aMarco.isKO());
    }

}
