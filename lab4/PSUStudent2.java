public abstract class PSUStudent2 {
    protected int age;
    protected double gpa;

    public PSUStudent2(int age, double gpa) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be 0.0 - 4.0");
        }
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public void setCurrentYear(int y) {}
    public void setPassThesis(boolean p) {}
    public abstract double revealGrade();
}

class UndergradStudent2 extends PSUStudent2 {
    private int currentYear = 1;

    public UndergradStudent2(int age, double gpa) {
        super(age, gpa);
    }

    public void setCurrentYear(int y) { this.currentYear = y; }
    public double revealGrade() {
        if (currentYear >= 4) return gpa;
        return 0.0;
    }
}

class GradStudent2 extends PSUStudent2 {
    private boolean passThesis = false;

    public GradStudent2(int age, double gpa) {
        super(age, gpa);
    }

    public void setPassThesis(boolean p) { this.passThesis = p; }
    public double revealGrade() {
        if (passThesis) return gpa;
        return 0.0;
    }
}
