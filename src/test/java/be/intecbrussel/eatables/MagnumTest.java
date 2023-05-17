package be.intecbrussel.eatables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagnumTest {

    Magnum magnum=new Magnum(Magnum.MagnumType.ALPINENUTS);
    @Test
    void shouldReturnEqualsType() {
        assertEquals(Magnum.MagnumType.ALPINENUTS,magnum.getType());
    }
}