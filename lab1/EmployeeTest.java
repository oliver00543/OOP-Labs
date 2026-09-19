public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("John", "Doe");
        e1.setFirstName("Johnny");
        e1.setLastName("Smith");
        e1.setMonthlySalary(3000);
        
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getMonthlySalary());


        Employee e2 = new Employee("Alice", "Brown", 4000);
        Employee e3 = new Employee("Bob", "White", 5000);

        System.out.println(e2.getYearlySalary());
        System.out.println(e3.getYearlySalary());

        e2.giveRaise();
        e3.giveRaise();

        System.out.println(e2.getYearlySalary());
        System.out.println(e3.getYearlySalary());
    }
}
