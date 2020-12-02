package ejercicifigures;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Rectangulo extends Figura {

    //atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //herencias
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetre() {
        return 2 * (base + altura);
    }

    //to string
    @Override
    public String toString() {
        return "Rectangulo de area: " + area() + " y perimetro " + perimetre();
    }

}
