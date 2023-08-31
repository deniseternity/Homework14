public abstract class Hogwarts {

    private String name;
    private int power;
    private int transgration;

    public Hogwarts(String name, int power, int transgration) {
        this.name = name;
        this.power = power;
        this.transgration = transgration;
    }

    public void compare(Hogwarts hogwarts) {
        if (power + transgration > hogwarts.getTransgration() + hogwarts.getPower()) {
            System.out.println(name + " сильнее " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " сильнее " + name);
        }
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgration() {
        return transgration;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "power=" + power +
                ", transgration=" + transgration +
                '}';
    }
}
