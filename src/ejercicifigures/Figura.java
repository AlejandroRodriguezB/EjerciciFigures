package ejercicifigures;

/**
 *
 * @author AlejandroRodriguezB
 */
public abstract class Figura implements Comparable<Figura> {

    @Override   //permite comparar las figuras
    public int compareTo(Figura t) {
        return (int) (this.area() - t.area());
    }

    //area y perimetro abstractos que se compartira con los hijos 
    public abstract double area();

    public abstract double perimetre();
}
