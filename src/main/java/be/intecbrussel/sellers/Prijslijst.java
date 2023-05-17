package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class Prijslijst {
    private double ballPrice=1;
    private double rocketPrice= 0.5;
    private double magnumStandartPrice= 1;

    public Prijslijst(double ballPrice, double rocketPrice, double magnumStandartPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandartPrice = magnumStandartPrice;
    }

    public Prijslijst(){

    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        switch (magnumType){
            case ALPINENUTS -> magnumStandartPrice =magnumStandartPrice*1.25;
            case MILKCHOCOLATE -> magnumStandartPrice = magnumStandartPrice*1.50;
            case BLACKCHOCOLATE -> magnumStandartPrice = magnumStandartPrice*1.40;
            case WHITECHOCOLATE -> magnumStandartPrice = magnumStandartPrice*1.70;
            case ROMANTICSTRAWBERRIES -> magnumStandartPrice = magnumStandartPrice*2;
        }


        return magnumStandartPrice;
    }

    public void setMagnumStandartPrice(double magnumStandartPrice) {

        this.magnumStandartPrice = magnumStandartPrice;
    }


}
