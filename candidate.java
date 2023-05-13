public class candidate {
    private String name;
    private String dob;
    private String nationality;
    private String caste;
    private float hscAverage;
    private float cgpaUG;
    private float cgpaPG;
    private int numberOfProjects;
    private boolean isFullTime;
    private int interviewMarks;
    private boolean isPassed;

public candidate(String name, String dob, String nationality, String caste, float hscAverage, float cgpaUG,
float cgpaPG, int numberOfProjects, boolean isFullTime, int interviewMarks) {
this.name = name;
this.dob = dob;
this.nationality = nationality;
this.caste = caste;
this.hscAverage = hscAverage;
this.cgpaUG = cgpaUG;
this.cgpaPG = cgpaPG;
this.numberOfProjects = numberOfProjects;
this.isFullTime = isFullTime;
this.interviewMarks = interviewMarks;
this.isPassed = false;
}
public String getName() {
    return name;
}

public String getDOB() {
    return dob;
}

public String getNationality() {
    return nationality;
}

public String getCaste() {
    return caste;
}

public float getHscAverage() {
    return hscAverage;
}

public float getCgpaUG() {
    return cgpaUG;
}

public float getCgpaPG() {
    return cgpaPG;
}

public int getNumberOfProjects() {
    return numberOfProjects;
}

public boolean isFullTime() {
    return isFullTime;
}

public int getInterviewMarks() {
    return interviewMarks;
}

public boolean isPassed() {
    return isPassed;
}

public void setPassed(boolean passed) {
    isPassed = passed;
}


}