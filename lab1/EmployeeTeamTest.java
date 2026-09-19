public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee boss = new Employee("Alice", "Brown", 5000);
        Employee emp = new Employee("Bob", "White", 3000);

        EmployeeTeam team = new EmployeeTeam(boss, emp);

       
        team.printEmployeeDetails();

       
        System.out.println(" ");
        team.printAllEmployeesDetails();

        
        System.out.println(" ");
        team.updateSalaryOfEmployee("Bob", 3500);
        team.printAllEmployeesDetails();


        System.out.println(" ");
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}
