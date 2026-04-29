package ejemplo;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int area() {
        if (base < 0 || altura < 0) {
            return -1;
        }
        if (base == 0 || altura == 0) {
            return 0;
        }
        return base * altura;
    }

    public int perimetro() {
        if (base < 0 || altura < 0) {
            return -1;
        }
        if (base == 0 || altura == 0) {
            return 0;
        }
        return 2 * (base + altura);
    }
}