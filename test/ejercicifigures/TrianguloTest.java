package ejercicifigures;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlejandroRodriguezB
 */
public class TrianguloTest {

    /**
     * Test of area method, of class Triangulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Triangulo instance = new Triangulo(10,40);
        double expResult = 200.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of perimetre method, of class Triangulo.
     */
    @Test
    public void testPerimetre() {
        System.out.println("perimetre");
        Triangulo instance = new Triangulo(20,30);
        double expResult = 60.0;
        double result = instance.perimetre();
        assertEquals(expResult, result, 0.0);

    }

    
}
