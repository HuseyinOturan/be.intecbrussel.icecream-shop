package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls;


    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
    public Cone(){

    }
    @Override
    public void eat() {
        System.out.println("You are eating"+balls);
    }


    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }

    @Override
    public String toString() {
        return "Cone"+Arrays.toString(balls)
                    ;
        }
    }

