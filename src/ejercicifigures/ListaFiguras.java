package ejercicifigures;

import java.util.Arrays;

/**
 *
 * @author AlejandroRodriguezB
 */
public class ListaFiguras {
    //atributos

    private Figura[] array;
    private int contador = 0;

    //constructor
    public ListaFiguras(int MAX) {
        array = new Figura[MAX];
    }

    //metodos
    public void agrega(Figura n) {
        array[contador] = n;
        contador++;
    }

    public void ordena() {
        Arrays.sort(this.getArray()); //este metodo no funcionaria si Figura no implementase Comparable
    }

    //getters y setters
    public Figura[] getArray() {
        return array;
    }

    public void setArray(Figura[] array) {
        this.array = array;
    }

    //metodos
    public double sumArea(int MAX) { //metodo de suma de todas las areas
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            i = i + array[a].area();
        }
        return i;
    }

    public double sumPerime(int MAX) { //metodo de suma de todos los perimetros
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            i = i + array[a].perimetre();
        }
        return i;
    }

    public double sumAreaFig(int MAX, Figura fig) { //metodo de suma de las areas del tio de figura que le pasemos
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass())) { //si las clases son iguales suma la area
                i = i + array[a].area();
            }
        }
        return i;
    }

    public double sumPerimeFig(int MAX, Figura fig) { //metodo de suma de los perimetros del tio de figura que le pasemos
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass())) { //si las clases son iguales suma el perimetro
                i = i + array[a].perimetre();
            }
        }
        return i;
    }

    public double areaMin(int MAX) { //metodo para el minimo de todas las areas
        double i = array[0].area();
        for (int a = 0; a < MAX; a++) {
            if (i > array[a].area()) {  //si existe un valor menor lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    public double areaMax(int MAX) { //metodo para el maximo de todas las areas
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (i < array[a].area()) { //si existe un valor mayor lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    public double areaMinFig(int MAX, Figura fig) { //metodo para el minimo de las areas del tipo figura que le pasemos
        double i = Double.MAX_VALUE; //le doy el maximo valor para que cualquier figura lo sobrepase(estaría mal si no hubiese figuras del tipo que le pasemos pero con 10k figuras no puede pasar)
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass()) && i > array[a].area()) {  //si existe un valor menor y tienen la misma clase lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    public double areaMaxFig(int MAX, Figura fig) { //metodo para el maximo de las areas del tipo figura que le pasemos
        double i = 0;
        for (int a = 0; a < MAX; a++) {
            if (fig.getClass().equals(array[a].getClass()) && i < array[a].area()) { //si existe un valor mayor y tienen la misma clase lo sustituye
                i = array[a].area();
            }
        }
        return i;
    }

    //to string de la lista
    @Override
    public String toString() {
        String blank = "";
        for (int i = 0; i < array.length; i++) {
            blank += array[i] + "\n";
        }
        return blank;
    }
}
