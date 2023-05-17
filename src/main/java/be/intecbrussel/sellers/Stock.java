package be.intecbrussel.sellers;

public class Stock {

    private int IceRockets =5;
    private int cones= 10;
    private int balls= 10;
    private int magni=10;

    public Stock() {
    }

    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.IceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    public int getIceRockets() {
        return IceRockets;
    }

    public void setIceRockets(int iceRockets) {
        if(iceRockets>0){
        this.IceRockets = iceRockets;
        } else throw new IllegalArgumentException("error");
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }


}
