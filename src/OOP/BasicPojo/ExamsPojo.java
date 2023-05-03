package OOP.BasicPojo;

public class ExamsPojo {

    private Double assesments;

    private Double quizes;

    private Double practices;

    public ExamsPojo(Double assesments, Double quizes, Double practices) {
        this.assesments = assesments;
        this.quizes = quizes;
        this.practices = practices;
    }

    @Override
    public String toString() {
        return "ExamsPojo{" +
                "assesments=" + assesments +
                ", quizes=" + quizes +
                ", practices=" + practices +
                '}';
    }

    public Double getAssesments() {
        return assesments;
    }

    public void setAssesments(Double assesments) {
        this.assesments = assesments;
    }

    public Double getQuizes() {
        return quizes;
    }

    public void setQuizes(Double quizes) {
        this.quizes = quizes;
    }

    public Double getPractices() {
        return practices;
    }

    public void setPractices(Double practices) {
        this.practices = practices;
    }

}
