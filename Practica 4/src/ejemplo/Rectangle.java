package ejemplo;

/**
 * Clase Rectangle.
 * 
 * @author Firdaus
 * @version 1.0
 */
public class Rectangle {

    private static final int MULTIPLIER = 2;

    private int base;
    private int altura;

    /**
     * Constructor del rectángulo.
     * 
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Valida los valores del rectángulo.
     * 
     * @return resultado de la validación
     */
    private int validateValues() {

        if (base < 0 || altura < 0) {
            return -1;
        }

        if (base == 0 || altura == 0) {
            return 0;
        }

        return 1;
    }

    /**
     * Calcula la superficie del rectángulo.
     * 
     * @return superficie del rectángulo
     */
    public int surface() {

        int validation = validateValues();

        if (validation != 1) {
            return validation;
        }

        return base * altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return perímetro del rectángulo
     */
    public int perimeter() {

        int validation = validateValues();

        if (validation != 1) {
            return validation;
        }

        return MULTIPLIER * (base + altura);
    }
}