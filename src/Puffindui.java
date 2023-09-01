class Puffindui extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private int witchcraft;

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

    public static void studentComparison(Puffindui student) {
        int sum1 = this.getHardworking() + this.getHonest() + this.getLoyal();
        int sum2 = student.getHardworking() + student.getHonest() + student.getLoyal();

        if (sum1 > sum2) {
            System.out.println("Студент " + this.getFullName() +
                    " лучше, чем " + student.getFullName());
        } else {
            System.out.println("Студент " + student.getFullName() +
                    " лучше, чем " + this.getFullName());
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", witchcraft " + getWitchcraft() + ", hardworking "
                + getHardworking() + ", loyal " + getLoyal() + ", honest " + getHonest());
    }
}
