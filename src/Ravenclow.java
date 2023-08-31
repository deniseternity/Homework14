public class Ravenclow extends Hogwarts {

    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    private int name;
    private int power;
    private int transgration;

    public Ravenclow(String name, int power, int transgration, int smart, int wise, int witty, int fullOfCreativity) {
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    private int sumFeatures() {
        return this.power + this.transgration
    }

    public void compare(Ravenclow ravenclow) {
        if (this.sumFeatures() > ravenclow.sumFeatures()) {
            System.out.println(name + " сильнее " + ravenclow.name);
        } else {
            System.out.println(ravenclow.name + " сильнее " + name);
        }
    }

    public int getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgration() {
        return transgration;
    }

    public String toString() {
        return "Ravenclow{" +
                "wise=" + wise +
                ", smart=" + smart +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                super.toString() +
                '}';
}
