import com.example.aventurasdemarcoyluis.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttacksTest {
    private Luis aLuis;
    private Marco aMarco;
    private Boo aBoo;
    private Goomba aGoomba;
    private Spiny aSpiny;

    @BeforeEach
    public void setUp() {
        aLuis = new Luis (3,4,20,20,5,3);
        aMarco = new Marco (2,3,20,10, 4,2);
        aBoo = new Boo(5,2 , 30, 2);
        aGoomba = new Goomba(3,20 , 75, 2);
        aSpiny = new Spiny(5,10 , 50, 2);
    }

    @Test
    public void playerReceivesAttacksByBoo() {
        // Marco is attacked by Boo
        assertEquals(aMarco.getCurrentHp(), 10);
        assertEquals(aBoo.getAtk(), 5);
        aMarco.atacadoPorBoo(aBoo);
        assertEquals(aMarco.getCurrentHp(), 10);

        // Luis is attacked by Boo
        assertEquals(aLuis.getCurrentHp(), 20);
        assertEquals(aBoo.getAtk(), 5);
        aLuis.atacadoPorBoo(aBoo);
        assertEquals(aLuis.getCurrentHp(), 15);
    }

    public void playerReceivesAttacksByGoomba() {
        // Marco is attacked by Goomba
        assertEquals(aLuis.getCurrentHp(), 10);
        assertEquals(aGoomba.getAtk(), 3);
        aLuis.atacadoPorGoomba(aGoomba);
        assertEquals(aLuis.getCurrentHp(), 7);

        // Luis is attacked by Boo
        assertEquals(aLuis.getCurrentHp(), 20);
        assertEquals(aBoo.getAtk(), 3);
        aLuis.atacadoPorBoo(aBoo);
        assertEquals(aLuis.getCurrentHp(), 17);
    }

    public void playerReceivesAttacksBySpiny() {
        // Marco attack by Spiny
        assertEquals(aMarco.getCurrentHp(), 10);
        assertEquals(aSpiny.getAtk(), 5);
        aMarco.atacadoPorSpiny(aSpiny);
        assertEquals(aMarco.getCurrentHp(), 5);

        // Luis is attacked by Spiny
        assertEquals(aLuis.getCurrentHp(), 20);
        assertEquals(aBoo.getAtk(), 5);
        aLuis.atacadoPorBoo(aBoo);
        assertEquals(aLuis.getCurrentHp(), 15);
    }

    @Test
    public void enemyReceivesAttacksByLuis() {

        // Boo is attacked by Luis
        assertEquals(aBoo.getHp(), 30);
        assertEquals(aLuis.getAtk(), 3);
        aBoo.atacadoPorLuis(aLuis);
        assertEquals(aBoo.getHp(), 30);

        // Goomba is attacked by Luis
        assertEquals(aGoomba.getHp(), 75);
        assertEquals(aLuis.getAtk(), 3);
        aGoomba.atacadoPorLuis(aLuis);
        assertEquals(aGoomba.getHp(), 72);

        // Spiny is attacked by Luis
        assertEquals(aSpiny.getHp(), 50);
        assertEquals(aLuis.getAtk(), 3);
        aSpiny.atacadoPorLuis(aLuis);
        assertEquals(aSpiny.getHp(), 47);
    }

    @Test
    public void enemyReceivesAttacksByMarco() {

        // Boo is attacked by Marco
        assertEquals(aBoo.getHp(), 30);
        assertEquals(aMarco.getAtk(), 2);
        aBoo.atacadoPorMarco(aMarco);
        assertEquals(aBoo.getHp(), 28);

        // Goomba is attacked by Marco
        assertEquals(aGoomba.getHp(), 75);
        assertEquals(aMarco.getAtk(), 2);
        aGoomba.atacadoPorMarco(aMarco);
        assertEquals(aGoomba.getHp(), 73);

        // Spiny is attacked by Marco
        assertEquals(aSpiny.getHp(), 50);
        assertEquals(aMarco.getAtk(), 2);
        aSpiny.atacadoPorMarco(aMarco);
        assertEquals(aSpiny.getHp(), 48);
    }

    @Test
    public void LuisAttack() {
        // Luis attacks a Boo
        assertEquals(aBoo.getHp(),30);
        aLuis.atacar(aBoo);
        assertEquals(aBoo.getHp(),30);
        // Luis attacks a Goomba
        assertEquals(aGoomba.getHp(),75);
        aLuis.atacar(aGoomba);
        assertEquals(aGoomba.getHp(),72);
        // Luis attacks a Spiny
        assertEquals(aSpiny.getHp(),50);
        aLuis.atacar(aSpiny);
        assertEquals(aSpiny.getHp(),47);
    }

    @Test
    public void BooAttack() {
        // Boo attacks a Luis
        assertEquals(aLuis.getCurrentHp(),20);
        aBoo.atacar(aLuis);
        assertEquals(aLuis.getCurrentHp(),15);
        // Boo attacks a Marco
        assertEquals(aMarco.getCurrentHp(),10);
        aBoo.atacar(aMarco);
        assertEquals(aMarco.getCurrentHp(),10);
    }

    @Test
    public void GoombaAttack() {
        // Goomba attacks a Luis
        assertEquals(aLuis.getCurrentHp(),20);
        aGoomba.atacar(aLuis);
        assertEquals(aLuis.getCurrentHp(),17);
        // Goomba attacks a Marco
        assertEquals(aMarco.getCurrentHp(),10);
        aGoomba.atacar(aMarco);
        assertEquals(aMarco.getCurrentHp(),7);
    }

    @Test
    public void SpinyAttack() {
        // Spiny attacks a Luis
        assertEquals(aLuis.getCurrentHp(),20);
        aSpiny.atacar(aLuis);
        assertEquals(aLuis.getCurrentHp(),15);
        // Spiny attacks a Marco
        assertEquals(aMarco.getCurrentHp(),10);
        aSpiny.atacar(aMarco);
        assertEquals(aMarco.getCurrentHp(),5);
    }






}
