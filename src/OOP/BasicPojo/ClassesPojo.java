package OOP.BasicPojo;

import java.util.List;
import java.util.Map;

public class ClassesPojo {

    private String mathClass;

    private String physicsClass;

    private String biologyClass;

    private String languageClass;

    private List<ExamsPojo> exams;

    public ClassesPojo() {
    }

    public String getMathClass() {
        return mathClass;
    }

    public void setMathClass(String mathClass) {
        this.mathClass = mathClass;
    }

    public String getPhysicsClass() {
        return physicsClass;
    }

    public void setPhysicsClass(String physicsClass) {
        this.physicsClass = physicsClass;
    }

    public String getBiologyClass() {
        return biologyClass;
    }

    public void setBiologyClass(String biologyClass) {
        this.biologyClass = biologyClass;
    }

    public String getLanguageClass() {
        return languageClass;
    }

    public void setLanguageClass(String languageClass) {
        this.languageClass = languageClass;
    }

    public List<ExamsPojo> getExams() {
        return exams;
    }

    public void setExams(List<ExamsPojo> exams) {
        this.exams = exams;
    }

    public ClassesPojo(String mathClass, String physicsClass, String biologyClass,
                       String languageClass, List<ExamsPojo> exams) {
        this.mathClass = mathClass;
        this.physicsClass = physicsClass;
        this.biologyClass = biologyClass;
        this.languageClass = languageClass;
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "ClassesPojo{" +
                "mathClass='" + mathClass + '\'' +
                ", physicsClass='" + physicsClass + '\'' +
                ", biologyClass='" + biologyClass + '\'' +
                ", languageClass='" + languageClass + '\'' +
                ", exams=" + exams +
                '}';
    }
}


