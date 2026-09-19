public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("Alice", 100.0);
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        a1.setName("Alice Smith");
        System.out.println("New Name: " + a1.getName());

        a1.deposit(50.0);
        System.out.println("After deposit 50: " + a1.getBalance());

        a1.deposit(-20.0);
        System.out.println("After deposit -20: " + a1.getBalance());

        Account a2 = new Account("Bob", -50.0);
        System.out.println("Bob Balance (started negative): " + a2.getBalance());
    }
}
