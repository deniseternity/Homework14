class Slytherin extends Hogwarts {
    private int force;
    private int dexterity;
    private int intelligence;
    private int loyalty;
    private int bravery;
    private int witchcraft;
    private int transgression;
    private int name;
    private int sumFeatures;

    public Slytherin(String fullName, int witchcraft, int transgression, int force, int intelligence, int dexterity, int loyalty, int bravery,) {
        super(fullName, witchcraft, transgression);
        this.force = force;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.loyalty = loyalty;
        this.bravery = bravery;
    }

    private int sumFeatures() {
        return this.force + this.dexterity + intelligence + loyalty + bravery + witchcraft + transgression;
    }

    public void compare(Slytherin slitherin) {
        if (this.sumFeatures() > slitherin.sumFeatures()) {
            System.out.println(name + " сильнее " + slitherin.name);
        } else {
            System.out.println(slitherin.name + " сильнее " + name);
        }
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

    public void peopleComparison(Slytherin people1, Slytherin people2) {
        int total1 = this.sumFeatures();
        int total2 = people1.sumFeatures();
        if (total1 > total2) {
            System.out.println("Студент " + people1.getFullName() + " лучше, чем " + people2.getFullName());
        } else {
            System.out.println("Студент " + people2.getFullName() + " лучше, чем " + people1.getFullName());
        }
    }

    @Override
    public String toString()() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() + ", transgression "
                + getTransgression() + ", force " + getForce() + ", dexterity " + getDexterity()
                + ", intelligence " + getIntelligence() + ", loyalty " + getLoyalty() + ", bravery " + getBravery());
    }
}