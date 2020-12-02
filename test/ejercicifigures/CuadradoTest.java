package ejercicifigures;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlejandroRodriguezB
 */
public class CuadradoTest {

    /**
     * Test of area method, of class Cuadrado.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Cuadrado instance = new Cuadrado(4);
        double expResult = 16.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of perimetre method, of class Cuadrado.
     */
    @Test
    public void testPerimetre() {
        System.out.println("perimetre");
        Cuadrado instance = new Cuadrado(20);
        double expResult = 80.0;
        double result = instance.perimetre();
        assertEquals(expResult, result, 0.0);
    }

    
    
}
