public class Person {
    protected String lastName;
    protected String firstName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}

class Child extends Person {
    private Person guardian;
    private int age;
    private int height;
    private double weight;

    public Child(int age, int height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }

    public Person getGuardian() {
        return guardian;
    }
}

class Parent extends Person {
    private Child child;
    private int money;

    public Parent() {
    }

    public Parent(int money) {
        this.money = money;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Child getChild() {
        return child;
    }
}

class Father extends Parent {
    private Mother wife;

    public Father(Mother wife) {
        this.wife = wife;
    }

    public Mother getWife() {
        return wife;
    }

    @Override
    public String getFirstName() {
        return "Mr." + firstName;
    }
}

class Mother extends Parent {
    private Father husband;

    public Mother() {
    }

    @Override
    public String getFirstName() {
        return "Ms." + firstName;
    }
}
