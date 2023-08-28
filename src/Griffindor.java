public class Griffindor extends Hogwarts{
    private int bravery;
    private int royal;
    private int honestly;

    public Griffindor(int power, int transgration, int bravery, int royal, int honestly) {
        super(power, transgration);
        this.bravery = bravery;
        this.royal = royal;
        this.honestly = honestly;
    }

    public void compare(Griffindor griffindor) {
        if (bravery + royal + honestly > griffindor.getBravery() + griffindor.getHonestly() + griffindor.getRoyal()) {
            System.out.println(name + " сильнее " + griffindor.name);
        } else {
            System.out.println(griffindor.name + " сильнее " + name);
        }
    }

    public int getBravery() {
        return bravery;
    }

    public int getRoyal() {
        return royal;
    }

    public int getHonestly() {
        return honestly;
    }

    @Override
        public String toString() {
            return "Griffindor{" +
                    "bravery=" + bravery +
                    ", royal=" + royal +
                    ", honestly=" + honestly +
                    ", power=" + power +
                    ", transgration=" + transgration +
                    '}';
        }
    }