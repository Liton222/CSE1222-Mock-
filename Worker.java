package q1;

class Worker {
    private String name;
    private double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Wage: " + wage;
    }
}

class Supervisor extends Worker {
    private String division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Division: " + division + ", Wage: " + getWage();
    }
}

class Director extends Supervisor {
    public Director(String name, double wage, String division) {
        super(name, wage, division);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Division: " + getDivision() + ", Wage: " + getWage() + " (Director)";
    }
}


