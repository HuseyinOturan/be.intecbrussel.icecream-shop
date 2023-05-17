package be.intecbrussel.sellers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void schuoldReturnEqualsWhenisCorrect() {

        Stock stock = new Stock();
        stock.setBalls(10);
        stock.setMagni(10);
        stock.setCones(12);
        stock.setIceRockets(14);

        assertAll(
                () -> assertEquals(10, stock.getBalls()),
                () -> assertEquals(10, stock.getMagni()),
                () -> assertEquals(12, stock.getCones()),
                () -> assertEquals(14, stock.getIceRockets())
        );

    }
    @Test
    void shouldThrowsExceptionWhenIsSetIceRoketNegatief(){

        Stock stockx=new Stock();
        Executable executable= () -> stockx.setIceRockets(-5);
        assertThrows(IllegalArgumentException.class,executable);
    }
    @Test
    void shouldThrowsExceptionWhenIsSetMagniNegatief(){

        Stock stocky=new Stock();
        Executable executable= () -> stocky.setMagni(-5);
        assertThrows(IllegalArgumentException.class,executable);
    }

}
