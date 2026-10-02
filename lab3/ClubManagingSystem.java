public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (Club c : clubList) total += c.determineBudget();
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club c : clubList) total += c.numMember;
        return total;
    }

    public Club getHighestMemberClub() {
        Club max = clubList[0];
        for (Club c : clubList) {
            if (c.numMember > max.numMember) max = c;
        }
        return max;
    }
}
