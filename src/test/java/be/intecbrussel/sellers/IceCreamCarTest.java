package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamCarTest {
        private IceCreamCar iceCreamCar;
        private Stock stock;
        private Prijslijst prijslijst;
    @Test
    void controlStockEnProfit(){
        Prijslijst prijslijst=new Prijslijst(1,1,3);
        Stock stock=new Stock(4,5,6,7);
        IceCreamCar iceCreamCar=new IceCreamCar(prijslijst, stock);
        iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON});
        assertAll(
                () -> assertEquals(4,stock.getCones()),
                ()-> assertEquals(.2,iceCreamCar.getProfit())
        );
    }
    @Test
    void shouldSubtractFromIceRocketStockAndAddProfitWhenOrdering(){
        // Vaste prijs van iceRoket is 0,5 EURO
        Prijslijst prijslijst1=new Prijslijst();
        Stock stock1=new Stock(3,3,3,3);
        IceCreamCar iceCreamCar2=new IceCreamCar(prijslijst1,stock1);
        iceCreamCar2.orderIceRocket();
        assertAll(()->assertEquals(2,stock1.getIceRockets()),
                ()->assertEquals(.1,iceCreamCar2.getProfit())
        );
    }
   /* @Test
    void shouldThrowExceptionWhenStockIsEmpty(){
        Prijslijst prijslijst13=new Prijslijst();
        Stock stock3=new Stock();
        IceCreamCar iceCreamCar3=new IceCreamCar(prijslijst13,stock3);
        iceCreamCar3.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        Executable executable = ()-> iceCreamCar3.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        assertThrows(IllegalArgumentException.class,executable);
    }*/

    @Test
    void iceRoketNullTest(){

        //Als er geen stock is, krijgen we  een exception na de method. Dus test methode is niet werkt.
        Prijslijst prii= new Prijslijst();
        Stock stockk=new Stock(1,1,1,1);
        IceCreamCar iceCreamCar1x=new IceCreamCar(prii,stockk);
        iceCreamCar1x.orderIceRocket();
        assertNull(stockk.getIceRockets());
    }

}