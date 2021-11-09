import com.example.aventurasdemarcoyluis.model.items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Luis;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marco;
import com.example.aventurasdemarcoyluis.model.items.RedMushroom;
import com.example.aventurasdemarcoyluis.model.items.Star;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestItems {
    private RedMushroom aRedMushroom;
    private HoneySyrup aHoneySyrup;
    private Star aStar;
    private Marco aMarco;
    private Luis aLuis;

    @BeforeEach
    public void setUp() {
        aRedMushroom = new RedMushroom ();
        aHoneySyrup = new HoneySyrup ();
        aStar = new Star ();
        aMarco = new Marco(5,4,40,23,2,3);
        aLuis = new Luis(6,7,55,3,5,6);
    }

    @Test
    public void usedByTest() {
        // RedMushroom
        assertEquals(aLuis.getCurrentHp(), 3);
        aRedMushroom.usedBy(aLuis);
        assertEquals(aLuis.getCurrentHp(), 8);
        // RedMushroom
        assertEquals(aMarco.getFp(), 2);
        aHoneySyrup.usedBy(aMarco);
        assertEquals(aMarco.getFp(), 5);
        // Star
        assertFalse(aLuis.getInvencible());
        aStar.usedBy(aLuis);
        assertTrue(aLuis.getInvencible());
    }
}
