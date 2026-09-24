public class Club {
    protected String clubName;
    protected int minNumMember;
    protected int numMember;

    public Club(String c, int m) {
        clubName = c;
        minNumMember = m;
        numMember = m;
    }

    public void addMember(int num) {
        numMember += num;
    }

    public void changeName(String newName) {
        clubName = newName;
    }

    public String getName() {
        return clubName;
    }

    public int determineBudget() {
        return numMember * 1000;
    }

    public void advertise() {
        System.out.println("Please join club: " + clubName);
    }
}

class SportsClub extends Club {
    public SportsClub(String c, int m) {
        super(c, m);
    }

    public int determineBudget() {
        return super.determineBudget() + (numMember - minNumMember) * 100;
    }

    public void changeName(String newName) {
    }
}

class MarketingClub extends Club {
    private int budget;

    public MarketingClub(String c, int m, int b) {
        super(c, m);
        budget = b;
    }

    public boolean useBudget(int amount) {
        if (amount <= budget) {
            budget -= amount;
            return true;
        }
        return false;
    }

    public int determineBudget() {
        if (budget > 1000) {
            return 0;
        }
        return super.determineBudget();
    }
}
