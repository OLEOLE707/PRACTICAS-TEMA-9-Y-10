package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {
	//Valores positivos
    @Test
    void testValoresPositivos() {
        Rectangulo r = new Rectangulo(3, 4);

        assertAll(
            () -> assertEquals(12, r.area()),
            () -> assertEquals(14, r.perimetro())
        );
    }

    @Test
    void testValoresCero() {
        Rectangulo r1 = new Rectangulo(0, 4);
        Rectangulo r2 = new Rectangulo(3, 0);
        Rectangulo r3 = new Rectangulo(0, 0);

        assertAll(
            () -> assertEquals(0, r1.area()),
            () -> assertEquals(0, r1.perimetro()),

            () -> assertEquals(0, r2.area()),
            () -> assertEquals(0, r2.perimetro()),

            () -> assertEquals(0, r3.area()),
            () -> assertEquals(0, r3.perimetro())
        );
    }

  //Valores negativos
    @Test
    void testValoresNegativos() {
        Rectangulo r1 = new Rectangulo(-3, 4);
        Rectangulo r2 = new Rectangulo(3, -4);
        Rectangulo r3 = new Rectangulo(-3, -4);

        assertAll(
            () -> assertEquals(-1, r1.area()),
            () -> assertEquals(-1, r1.perimetro()),

            () -> assertEquals(-1, r2.area()),
            () -> assertEquals(-1, r2.perimetro()),

            () -> assertEquals(-1, r3.area()),
            () -> assertEquals(-1, r3.perimetro())
        );
    }

    //Valores 0
    @Test
    void testConErroresIntencionados() {
        Rectangulo r = new Rectangulo(3, 4);

        assertAll(
            () -> assertEquals(13, r.area()),        
            () -> assertEquals(20, r.perimetro())    
        );
    }
}