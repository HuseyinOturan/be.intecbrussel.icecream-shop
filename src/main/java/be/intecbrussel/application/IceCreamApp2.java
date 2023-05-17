package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.Prijslijst;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2 {
    public static void main(String[] args) {
        Prijslijst prijslijst2=new Prijslijst(1,1,2);
        Stock stock=new Stock();
        IceCreamCar iceCreamCar = new IceCreamCar(prijslijst2,stock);

        Eatable [] eatables={iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket()};
        for (int i = 0; i < eatables.length; i++) {
            System.out.println(eatables[i]);
        }

    }
}
