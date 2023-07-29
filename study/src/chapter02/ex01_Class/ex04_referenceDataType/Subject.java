package chapter02.ex01_Class.ex04_referenceDataType;

/**
 * 과목 클래스
 */
public class Subject {

    /**
     * 과목명, 과목이름
     */
    private String subjectName;

    /**
     * 과목 점수
     */
    private int subjectScore;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }
}
