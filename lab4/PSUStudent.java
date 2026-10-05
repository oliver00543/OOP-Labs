public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa) {
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public void setCurrentYear(int y) {}
    public void setPassThesis(boolean p) {}
    public abstract double revealGrade();
}

class UndergradStudent extends PSUStudent {
    private int currentYear = 1;

    public UndergradStudent(int age, double gpa) {
        super(age, gpa);
    }

    public void setCurrentYear(int y) { this.currentYear = y; }
    public double revealGrade() {
        if (currentYear >= 4) return gpa;
        return 0.0;
    }
}

class GradStudent extends PSUStudent {
    private boolean passThesis = false;

    public GradStudent(int age, double gpa) {
        super(age, gpa);
    }

    public void setPassThesis(boolean p) { this.passThesis = p; }
    public double revealGrade() {
        if (passThesis) return gpa;
        return 0.0;
    }
}
