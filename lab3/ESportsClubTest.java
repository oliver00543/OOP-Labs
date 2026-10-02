public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        System.out.println(e.getName());
        System.out.println(e.minNumMember);
        System.out.println(e.getNumMember());
        e.advertise();
        System.out.println(e.determineBudget());
        System.out.println(e.getName());

        Club c = new ESportsClub("Esport", 100);
        System.out.println(c.getName());
        System.out.println(c.minNumMember);
        System.out.println(c.numMember);
        c.advertise();
        System.out.println(c.determineBudget());
        System.out.println(c.getName());
    }
}
