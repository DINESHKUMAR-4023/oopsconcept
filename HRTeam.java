import java.util.List;

public class HRTeam {
    public void notifyCandidates(List<candidate> candidates) {
        for (candidate candidate : candidates) {
            System.out.println("Candidate: " + candidate.getName());
            if (candidate.isPassed()) {
                System.out.println("Status: Passed");
            } else {
                System.out.println("Status: Rejected");
            }
            System.out.println("--------------------------------------");
        }
    }
}
