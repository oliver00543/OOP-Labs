public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    
    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails() {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getMonthlySalary());
    }

    
    public void printAllEmployeesDetails() {
        System.out.println(boss.getFirstName() + " " + boss.getLastName() + " " + boss.getMonthlySalary());
        printEmployeeDetails();
    }

    
    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (boss.getFirstName().equals(firstname)) {
            boss.setMonthlySalary(newSalary);
        }
        if (employee.getFirstName().equals(firstname)) {
            employee.setMonthlySalary(newSalary);
        }
    }

    
    public void giveRaiseToAllEmployees() {
        boss.giveRaise();
        employee.giveRaise();
    }
}
