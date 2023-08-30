class Slytherin extends Hogwarts {
    private int force;
    private int dexterity;
    private int intelligence;
    private int loyalty;
    private int bravery;
    private int witchcraft;
    private int transgression;

    public Slytherin(String fullName, int witchcraft, int transgression, int force, int intelligence, int dexterity, int loyalty, int bravery,) {
        super(fullName, witchcraft, transgression);
        this.force = force;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.loyalty = loyalty;
        this.bravery = bravery;
    }

    public int getForce() {
        return force;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getBravery() {
        return bravery;
    }

    public int getFullName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public static void peopleComparison(Slytherin people1, Slytherin people2) {
        int total1 = people1.getForce() + people1.getDexterity() + people1.getIntelligence() + people1.getLoyalty() + people1.getBravery();
        int total2 = people2.getForce() + people2.getDexterity() + people2.getIntelligence() + people2.getLoyalty() + people2.getBravery();
        if (total1 > total2) {
            System.out.println("Студент " + people1.getFullName() + " лучше, чем " + people2.getFullName());
        } else {
            System.out.println("Студент " + people2.getFullName() + " лучше, чем " + people1.getFullName());
        }
    }

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() + ", transgression "
                + getTransgression() + ", force " + getForce() + ", dexterity " + getDexterity()
                + ", intelligence " + getIntelligence() + ", loyalty " + getLoyalty() + ", bravery " + getBravery());
    }
}