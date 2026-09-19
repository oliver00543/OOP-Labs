public class AccountListTest {
    public static void main(String[] args) {
        AccountList al = new AccountList(3);

        al.appendAccount(new Account("Oak", 1.0));
        al.appendAccount(new Account("Two", 0.1));

        System.out.println(al.getAccount(2));

        System.out.println(al.getAccount(1).getBalance());

        al.appendAccount(new Account("tmp", 0));

        System.out.println(al.appendAccount(new Account("tmp2", 0)));
    }
}
