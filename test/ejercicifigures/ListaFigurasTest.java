
package ejercicifigures;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlejandroRodriguezB
 */
public class ListaFigurasTest {
    
    /**
     * Test of sumArea method, of class ListaFiguras.
     */
    @Test
    public void testSumArea() {
        System.out.println("sumArea");
        int MAX = 2;
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Circulo(3));
        instance.agrega(new Cuadrado(2));
        
        double expResult = 4 + 28.27;
        double result = instance.sumArea(MAX);
        assertEquals(expResult, result, 1);
    }

    
    /**
     * Test of sumPerime method, of class ListaFiguras.
     */
    @Test
    public void testSumPerime() {
        System.out.println("sumPerime");
        int MAX = 3;
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Circulo(6));
        instance.agrega(new Cuadrado(10));
        instance.agrega(new Triangulo(2,5));
        
        double expResult = 37.69 + 40+ 6;
        double result = instance.sumPerime(MAX);
        assertEquals(expResult, result, 0.5);
    }

    /**
     * Test of sumAreaFig method, of class ListaFiguras.
     */
    @Test
    public void testSumAreaFig() {
        System.out.println("sumAreaFig");
        int MAX = 4;
        Figura fig = new Triangulo(0,0);
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Triangulo(20,15));
        instance.agrega(new Triangulo(2,5));
        instance.agrega(new Circulo(6));
        instance.agrega(new Cuadrado(10));
        
        double expResult = 150.0 + 5;
        double result = instance.sumAreaFig(MAX, fig);
        assertEquals(expResult, result, 0.02);
    }

    /**
     * Test of sumPerimeFig method, of class ListaFiguras.
     */
    @Test
    public void testSumPerimeFig() {
        System.out.println("sumPerimeFig");
        int MAX = 5;
        Figura fig = new Cuadrado(0);
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Triangulo(20,15));
        instance.agrega(new Triangulo(200,53));
        instance.agrega(new Circulo(60));
        instance.agrega(new Rectangulo(10,40));
        instance.agrega(new Circulo(666));
        double expResult = 0.0;
        double result = instance.sumPerimeFig(MAX, fig);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of areaMin method, of class ListaFiguras.
     */
    @Test
    public void testAreaMin() {
        System.out.println("areaMin");
        int MAX = 6;
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Rectangulo(20,15));
        instance.agrega(new Triangulo(200,53));
        instance.agrega(new Cuadrado(1));
        instance.agrega(new Triangulo(10,40));
        instance.agrega(new Circulo(666));
        instance.agrega(new Cuadrado(44));
        double expResult = 1.0;
        double result = instance.areaMin(MAX);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of areaMax method, of class ListaFiguras.
     */
    @Test
    public void testAreaMax() {
        System.out.println("areaMax");
        int MAX = 7;
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Rectangulo(20,15));
        instance.agrega(new Triangulo(200,53));
        instance.agrega(new Cuadrado(1));
        instance.agrega(new Triangulo(10,40));
        instance.agrega(new Circulo(6));
        instance.agrega(new Cuadrado(4));
        instance.agrega(new Rectangulo(4,4));
        double expResult = 5300.0;
        double result = instance.areaMax(MAX);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of areaMinFig method, of class ListaFiguras.
     */
    @Test
    public void testAreaMinFig() {
        System.out.println("areaMinFig");
        int MAX = 8;
        Figura fig = new Circulo(0);
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Rectangulo(20,15));
        instance.agrega(new Triangulo(200,53));
        instance.agrega(new Circulo(2));
        instance.agrega(new Triangulo(10,40));
        instance.agrega(new Circulo(60));
        instance.agrega(new Circulo(40));
        instance.agrega(new Triangulo(49,42));
        instance.agrega(new Rectangulo(40,4));
        double expResult = 12.5663;
        double result = instance.areaMinFig(MAX, fig);
        assertEquals(expResult, result, 0.02);
    }

    /**
     * Test of areaMaxFig method, of class ListaFiguras.
     */
    @Test
    public void testAreaMaxFig() {
        System.out.println("areaMaxFig");
        int MAX = 9;
        Figura fig = new Rectangulo(0,0);
        ListaFiguras instance = new ListaFiguras(MAX);
        instance.agrega(new Triangulo(20,15));
        instance.agrega(new Triangulo(200,53));
        instance.agrega(new Cuadrado(20));
        instance.agrega(new Rectangulo(1,4));
        instance.agrega(new Cuadrado(60));
        instance.agrega(new Circulo(40));
        instance.agrega(new Rectangulo(45,100));
        instance.agrega(new Rectangulo(4,4));
        instance.agrega(new Rectangulo(50,46));
        double expResult = 4500.0;
        double result = instance.areaMaxFig(MAX, fig);
        assertEquals(expResult, result, 0.0);

    }

    
}
