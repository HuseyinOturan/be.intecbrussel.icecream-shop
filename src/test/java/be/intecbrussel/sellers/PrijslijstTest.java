package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.*;

class PrijslijstTest {
    private Boolean actual;



    // Test is voor Alpienenuts.
   @ParameterizedTest
   @CsvSource(value = {"4, 5 "})
    void SchuldReturnTrueWhenUwMagnumPriceIsCorrect(int MagnumAmount, double expected ) {

        Prijslijst prijslijst=new Prijslijst();

       double actual= MagnumAmount * prijslijst.getMagnumPrice(Magnum.MagnumType.ALPINENUTS);

       assertEquals(expected,actual);
    }

   /* @ParameterizedTest
    @CsvSource(value = {"1, true"})
    void SchuldReturnTrueWhenUwPriceIsCorrect(int bal, boolean expected) {

        Prijslijst prijslijst = new Prijslijst(1, 1, 2);
        if(bal==prijslijst.getBallPrice()){

            actual=true;
        }else {
            actual=false;
        }
   }*/
    @Test
    void shouldReturnEquals(){
       Prijslijst prijslijst=new Prijslijst(2,1,1);
        assertAll(
                ()-> assertEquals(2,prijslijst.getBallPrice()),
                ()-> assertEquals(1,prijslijst.getRocketPrice()),
                ()-> assertEquals(1.25,prijslijst.getMagnumPrice(Magnum.MagnumType.ALPINENUTS))
);
}
    @Test
    void SouldReturnEqualsWhenIsCorrect(){
       // vaste prijs
       // private double ballPrice=1;
        // private double rocketPrice= 0.5;
       // private double magnumStandartPrice= 1 voor ALPINENUTS

       Prijslijst prijslijst1=new Prijslijst();
       assertAll(
               () -> assertEquals(1,prijslijst1.getBallPrice()),
               () -> assertEquals(0.5,prijslijst1.getRocketPrice()),
               () -> assertEquals(1.25,prijslijst1.getMagnumPrice(Magnum.MagnumType.ALPINENUTS))

       );
    }

    @Test
    void SchouldReturnWhenIsCorrect(){

        Prijslijst prijslijst2=new Prijslijst();
        prijslijst2.setBallPrice(1);

        assertEquals(1,prijslijst2.getBallPrice());
    }

    @Test
    void ScholudReturnWhenIsCorrect(){

        Prijslijst prijslijst3= new Prijslijst();
        prijslijst3.setRocketPrice(4);

        assertEquals(4,prijslijst3.getRocketPrice());
    }




}