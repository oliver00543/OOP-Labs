public class Player {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public Player(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }
}

class FootballPlayer extends Player {
    public FootballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 90;
    }
}

class BasketballPlayer extends Player {
    public BasketballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}
