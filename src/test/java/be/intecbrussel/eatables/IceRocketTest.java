package be.intecbrussel.eatables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceRocketTest {
    IceRocket iceRocket = new IceRocket();
    @BeforeEach
    void setUp() {
        System.out.println("test is begint.");

    }
    @Test
    void shouldReturnEquals(){
        assertEquals("iceRocket",iceRocket.toString());
    }

}