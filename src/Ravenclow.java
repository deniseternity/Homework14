public class Ravenclow extends Hogwarts {

    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclow(String name, int power, int transgration, int smart, int wise, int witty, int fullOfCreativity) {
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public void compare(Ravenclow ravenclow) {
        if (smart + wise + witty + fullOfCreativity > ravenclow.smart + ravenclow.wise + ravenclow.witty + ravenclow.fullOfCreativity) {
            System.out.println(name + " сильнее " + ravenclow.name);
        } else {
            System.out.println(ravenclow.name + " сильнее " + name);
        }
    }

    @Override
    public String toString() {
        return "Ravenclow{" +
                "wise=" + wise +
                ", smart=" + smart +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                ", power=" + power +
                ", transgration=" + transgration +
                '}';
    }
}
