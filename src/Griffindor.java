public class Griffindor extends Hogwarts{
    private int bravery;
    private int royal;
    private int honestly;
    private int nobleness;
    private int honor;

    public Griffindor(int power, int transgration, int bravery, int royal, int honestly) {
        super(power, transgration);
        this.bravery = bravery;
        this.royal = royal;
        this.honestly = honestly;
    }

    private int sumFeatures() {
        return this.nobleness + this.honor + this.bravery;
    }
    public void compare(Griffindor griffindor) {

        if (this.sumFeatures() > griffindor.sumFeatures()) {
            System.out.println(name + " сильнее " + griffindor.name);
        } else if (bravery + royal + honestly > griffindor.getBravery() + griffindor.getHonestly() + griffindor.getRoyal()) {
            System.out.println(griffindor.name + " сильнее " + name);
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
                    super.toString() +
                    '}';
        }
        }