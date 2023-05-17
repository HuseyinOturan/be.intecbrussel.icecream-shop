package be.intecbrussel.eatables;

public class Magnum implements Eatable{

    private MagnumType type;

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public Magnum(){

    }

    @Override
    public void eat() {
        System.out.println("eating "+type.name() +" magnum");

    }

    public MagnumType getType() {
        return type;
    }
    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;
    }

    @Override
    public String toString() {
        return "Magnum{" +
                "type=" + type +
                '}';
    }
}
