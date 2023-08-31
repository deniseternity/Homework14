class Puffindui extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private int witchcraft;
    private int name;
    private int transgression;

    public Puffindui(String fullName, int witchcraft, int transgression, int hardworking, int loyal, int honest) {
        super(fullName, witchcraft, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getFullName() {
        return name;
    }

    public int getTransgression() {
        return transgression;
    }

    public static void studentComparison(Puffindui student1, Puffindui student2) {
        int sum1 = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
        int sum2 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getFullName() +
                    " лучше, чем " + student2.getFullName());
        } else {
            System.out.println("Студент " + student2.getFullName() +
                    " лучше, чем " + student1.getFullName());
        }
    }

    @Override
    public String toString() {
        System.out.println("Имя - " + getFullName() + ", witchcraft " + getWitchcraft() +
                ", transgression " + getTransgression() + ", hardworking " + getHardworking() + ", loyal " +
                getLoyal() + ", honest " + getHonest());
    }
}
