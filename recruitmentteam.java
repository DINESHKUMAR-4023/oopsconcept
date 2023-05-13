import java.util.ArrayList;
import java.util.List;

public class recruitmentteam {
    public List<candidate> selectedCandidates(List<candidate> candidates) {
        List<candidate> selectedCandidates = new ArrayList<>();

        for (candidate candidate : candidates) {
            if (isdob(candidate.getDOB()) &&
                isHSCAverageValid(candidate.getHscAverage(), candidate.getCaste()) &&
                isCGPAValid(candidate.getCgpaUG(), candidate.getCgpaPG()) &&
                isProjectValid(candidate.getNumberOfProjects()) &&
                isInterviewMarksValid(candidate.getInterviewMarks()) &&
                isNationalityValid(candidate.getNationality())) {
                    candidate.setPassed(true);
                selectedCandidates.add(candidate);
            }
            else{
                candidate.setPassed(false);
                selectedCandidates.add(candidate);
            }
        }

        return selectedCandidates;
    }

    private boolean isdob(String dob) {
        String[] parts = dob.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        return year > 1999 || (year == 1999 && month >= 7);
    }

    private boolean isHSCAverageValid(float hscAverage, String caste) {
        if (caste.equals("SC") || caste.equals("ST")) {
            return hscAverage >= 50;
        } else {
            return hscAverage >= 60;
        }
    }

    private boolean isCGPAValid(float cgpaUG, float cgpaPG) {
        return cgpaUG >= 8 && cgpaPG >= 8;
    }

    private boolean isProjectValid(int numberOfProjects) {
        return numberOfProjects >= 2;
    }

    private boolean isInterviewMarksValid(int interviewMarks) {
        return interviewMarks >= 35;
    }

    private boolean isNationalityValid(String nationality) {
        return nationality.equals("India");
    }
}
