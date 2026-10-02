public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(0);

        Employee e1 = new Fulltimer("Alice", 3000);
        Employee e2 = new Manager("Bob", 2000, 5);
        Employee e3 = new Manager("Charlie", 2000, 15);
        Employee e4 = new Hourly("Dave", 50, 40);

        pm.payment(e1);
        pm.payment(e2);
        pm.payment(e3);
        pm.payment(e4);

        System.out.println(pm.totalPay);
    }
}
