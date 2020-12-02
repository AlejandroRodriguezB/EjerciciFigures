package ejercicifigures;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Cuadrado extends Figura {

    //atributos
    private double lado;

    //constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //herencias
    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetre() {
        return 4 * lado;
    }
    //to string

    @Override
    public String toString() {
        return "Cuadrado de area: " + area() + " y perimetro " + perimetre();
    }
}
