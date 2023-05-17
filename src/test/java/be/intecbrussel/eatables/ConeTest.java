package be.intecbrussel.eatables;

import be.intecbrussel.sellers.Stock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {

    private Cone cone;
    @BeforeEach
    void setUp(){
        cone = new Cone(new Cone.Flavor[]{Cone.Flavor.BANANA});
        System.out.println("test begint");
    }
    @AfterEach
    void afterAMethod() {
        System.out.println("test is gedaan");
    }
    @Test
    void shouldReturnEquals(){
        assertEquals("Cone[BANANA]",cone.toString());
    }
}

