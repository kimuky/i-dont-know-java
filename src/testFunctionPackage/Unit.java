package testFunctionPackage;

public class Unit {

    private String name;
    private String tribe;
    private int hp;

    public Unit(String name, String tribe, int hp) {
        this.name = name;
        this.tribe = tribe;
        this.hp = hp;
    }

    @Override
    public String toString () {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }
}
