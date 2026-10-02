public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule apm = new AdvancedPaymentModule(0);

        Employee e1 = new Fulltimer("Alice", 3000);
        Employee e2 = new Manager("Bob", 2000, 5);
        Employee e3 = new Manager("Charlie", 2000, 15);
        Employee e4 = new Hourly("Dave", 50, 40);

        Employee[] employees = { e1, e2, e3, e4 };

        apm.payment(employees);

        System.out.println(apm.totalPay);
    }
}
