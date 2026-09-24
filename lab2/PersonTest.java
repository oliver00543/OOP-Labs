public class PersonTest {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println(m.getFirstName());

        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println(f.getFirstName());

        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName());
    }
}
