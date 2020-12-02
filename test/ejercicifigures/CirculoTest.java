package ejercicifigures;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlejandroRodriguezB
 */
public class CirculoTest {
    /**
     * Test of area method, of class Cuadrado.
     */
    @Test
    public void testPerimetre() {
        System.out.println("perimetre");
        Circulo instance = new Circulo(2);
        double expResult = 12.5663;
        double result = instance.perimetre();
        assertEquals(expResult, result, 0.2);
        
    }

    /**
     * Test of area method, of class Circulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circulo instance = new Circulo(5);
        double expResult = 78.5398;
        double result = instance.area();
        assertEquals(expResult, result, 0.2);
        
    }

    
}
