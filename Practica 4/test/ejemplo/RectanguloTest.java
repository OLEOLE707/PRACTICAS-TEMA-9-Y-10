package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	//Valores positivos
    @Test
    void testValoresPositivos() {
        Rectangle r = new Rectangle(3, 4);

        assertAll(
            () -> assertEquals(12, r.surface()),
            () -> assertEquals(14, r.perimeter())
        );
    }

    @Test
    void testValoresCero() {
        Rectangle r1 = new Rectangle(0, 4);
        Rectangle r2 = new Rectangle(3, 0);
        Rectangle r3 = new Rectangle(0, 0);

        assertAll(
            () -> assertEquals(0, r1.surface()),
            () -> assertEquals(0, r1.perimeter()),

            () -> assertEquals(0, r2.surface()),
            () -> assertEquals(0, r2.perimeter()),

            () -> assertEquals(0, r3.surface()),
            () -> assertEquals(0, r3.perimeter())
        );
    }

  //Valores negativos
    @Test
    void testValoresNegativos() {
        Rectangle r1 = new Rectangle(-3, 4);
        Rectangle r2 = new Rectangle(3, -4);
        Rectangle r3 = new Rectangle(-3, -4);

        assertAll(
            () -> assertEquals(-1, r1.surface()),
            () -> assertEquals(-1, r1.perimeter()),

            () -> assertEquals(-1, r2.surface()),
            () -> assertEquals(-1, r2.perimeter()),

            () -> assertEquals(-1, r3.surface()),
            () -> assertEquals(-1, r3.perimeter())
        );
    }

    //Valores 0
    @Test
    void testConErroresIntencionados() {
        Rectangle r = new Rectangle(3, 4);

        assertAll(
            () -> assertEquals(13, r.surface()),        
            () -> assertEquals(20, r.perimeter())    
        );
    }
}