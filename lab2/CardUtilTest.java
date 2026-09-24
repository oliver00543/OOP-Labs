public class CardUtilTest {
    public static void main(String[] args) {
        Card c1 = new Card(Rank.ACE, Suite.SPADES);
        Card c2 = new Card(Rank.KING, Suite.HEARTS);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Is c1 highest? " + CardUtil.isHighestCard(c1));
        System.out.println("Is c2 highest? " + CardUtil.isHighestCard(c2));
    }
}
