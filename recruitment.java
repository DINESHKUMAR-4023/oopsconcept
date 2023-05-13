import java.util.ArrayList;
import java.util.List;

public class recruitment {
    public static void main(String[] args) {
        candidate candidate1 = new candidate("john", "1999-07-15", "India", "BC", 80, 70f, 8.5f, 1, false, 40);
        candidate candidate2 = new candidate("jack", "1999-09-23", "India", "SC", 90, 85f, 8.9f, 3, true, 50);
        candidate candidate3 = new candidate("jill", "2000-01-03", "India", "ST", 68, 55.3f, 8.1f, 2, true, 45);


        List<candidate> candidates = new ArrayList<>();
        candidates.add(candidate1);
        candidates.add(candidate2);
        candidates.add(candidate3);

        recruitmentteam team = new recruitmentteam();
        List<candidate> selectedCandidates = team.selectedCandidates(candidates);

        HRTeam hrTeam = new HRTeam();
        hrTeam.notifyCandidates(selectedCandidates);
    }
}
