package ejercicifigures;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Triangulo extends Figura {
    //atributos

    private double base;
    private double altura;

    //constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    //herencias
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetre() {
        return base + base + base;
    }

    //to string
    @Override
    public String toString() {
        return "Triangulo de area: " + area() + " y perimetro " + perimetre();
    }
}
