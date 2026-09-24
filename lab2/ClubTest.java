public class ClubTest {
    public static void main(String[] args) {
        SportsClub s = new SportsClub("Football Club", 10);
        s.addMember(5);
        s.changeName("New Name");
        System.out.println(s.getName());
        System.out.println(s.determineBudget());

        MarketingClub m = new MarketingClub("Media Club", 5, 1200);
        System.out.println(m.determineBudget());
        System.out.println(m.useBudget(500));
        System.out.println(m.determineBudget());
    }
}
