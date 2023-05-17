package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.Prijslijst;

public class IceCreamApp {
    public static void main(String[] args) {
        Prijslijst prijslijst1=new Prijslijst(1,0.5,2);

        IceCreamSalon iceCreamSalon=new IceCreamSalon(prijslijst1);


        Eatable [] eatables={iceCreamSalon.orderIceRocket(), iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.VANILLA, Cone.Flavor.BANANA}),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE) };

                for(Eatable eat:eatables){ eat.eat();}

        System.out.println(iceCreamSalon.getTotalProfit());


    }
}