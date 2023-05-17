package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamSalonTest {

  @Test
    void SchouldReturnWePorfitIsCorrect(){

    Prijslijst prijslijst=new Prijslijst(1,1,1);
    IceCreamSalon iceCreamSalon=new IceCreamSalon(prijslijst);

    iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA});

    assertEquals(.25,iceCreamSalon.getTotalProfit());

  }
  @Test
  void SchoulReturnWhenTotalProfitisCorrect(){
   // private double ballPrice=1;
    //private double rocketPrice= 0.5;
   // private double magnumStandartPrice= 1;

    Prijslijst prijs = new Prijslijst();
    IceCreamSalon ice =new IceCreamSalon(prijs);

    ice.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON});
    ice.orderIceRocket();
    ice.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);


    assertEquals(0.365,ice.getTotalProfit());
  }

}
