package ejercicifigures;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlejandroRodriguezB
 */
public class RectanguloTest {
    

    /**
     * Test of area method, of class Rectangulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangulo instance = new Rectangulo(2,2);
        double expResult = 4.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of perimetre method, of class Rectangulo.
     */
    @Test
    public void testPerimetre() {
        System.out.println("perimetre");
        Rectangulo instance = new Rectangulo(22,12);
        double expResult = 68.0;
        double result = instance.perimetre();
        assertEquals(expResult, result, 0.0);
    }


    
}
