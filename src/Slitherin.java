class Slytherin extends Hogwarts {
    private int force;
    private int dexterity;
    private int intelligence;
    private int loyalty;
    private int bravery;
    private int witchcraft;
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

    public int getWitchcraft() {
        return witchcraft;
    }

    public void peopleComparison(Slytherin people) {
        int total1 = this.sumFeatures();
        int total2 = people.sumFeatures();
        if (total1 > total2) {
            System.out.println("Студент " + this.getFullName() + " лучше, чем " + people.getFullName());
        } else {
            System.out.println("Студент " + people.getFullName() + " лучше, чем " + this.getFullName());
        }
    }

    @Override
    public String toString()() {
        return super.toString() + ", witchcraft " + getWitchcraft() + ", force " + getForce() + ", dexterity " + getDexterity()
                + ", intelligence " + getIntelligence() + ", loyalty " + getLoyalty() + ", bravery " + getBravery());
    }
}