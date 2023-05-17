package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{

    private Prijslijst prijslijst;
    private Stock stock;
    private double profit;

    public IceCreamCar() {
    }

    public IceCreamCar(Prijslijst prijslijst, Stock stock) {
        this.prijslijst = prijslijst;
        this.stock = stock;

    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        return prepareCone(flavor);
    }

    private Cone prepareCone(Cone.Flavor[] flavor) {
        if (stock.getCones() > 0 && stock.getBalls() >= flavor.length) {
            stock.setBalls(stock.getBalls() - flavor.length);
            stock.setCones(stock.getCones() - 1);
            profit = profit + prijslijst.getBallPrice()*.20;
            return new Cone(flavor);
        } else System.out.println(" niet meer Cone  ");
        return null;

        }

    @Override
    public IceRocket orderIceRocket() {
        return prepareIceRocket();
    }
    private IceRocket prepareIceRocket (){
        if (stock.getIceRockets()>0){
            stock.setIceRockets(stock.getIceRockets()-1);
            profit += prijslijst.getRocketPrice()*.20;
            return new IceRocket();
        }else System.out.println("NIET MEER ICE ROCKET");
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        return prepareMagnum(magnumType);
    }
    private Magnum prepareMagnum (Magnum.MagnumType magnumType){
        if (stock.getMagni()>0){
            stock.setMagni(stock.getMagni()-1);
            profit += prijslijst.getMagnumPrice(magnumType)*.01;
            return new Magnum(magnumType);
        }else System.out.println("NIET MEER MAGNUM");
        return null;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
