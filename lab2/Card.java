enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
enum Suite { DIAMONDS, CLUBS, HEARTS, SPADES }

public class Card {
    private Rank rank;
    private Suite suit;

    public Card(Rank rank, Suite suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class CardUtil {
    public static final Rank HIGHEST_RANK = Rank.ACE;
    public static final Suite HIGHEST_SUITE = Suite.SPADES;

    public static boolean isHighestCard(Card card) {
        if (card.getRank() == HIGHEST_RANK && card.getSuit() == HIGHEST_SUITE) {
            return true;
        } else {
            return false;
        }
    }
}
