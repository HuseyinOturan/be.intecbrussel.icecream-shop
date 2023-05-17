package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{

    private Prijslijst prijslijst;
    private double totalProfit;

    public IceCreamSalon(Prijslijst prijslijst) {
        this.prijslijst = prijslijst;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        totalProfit += prijslijst.getBallPrice()*.25;
        return new Cone(flavor);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += prijslijst.getRocketPrice()*.20;
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        totalProfit += prijslijst.getMagnumPrice(magnumType)*.01;
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
