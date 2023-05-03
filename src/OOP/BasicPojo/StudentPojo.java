package OOP.BasicPojo;

import java.util.List;
import java.util.Map;

public class StudentPojo {

    private String firstName;

    private String lastName;

    private Integer id;

    private String emailId;

    private List<ClassesPojo> classes;

    private List<SportsPojo> sports;

    private Boolean isAvailable;

    public StudentPojo(String firstName, String lastName, Integer id,
                       String emailId, List<ClassesPojo> classes, List<SportsPojo> sports, Boolean isAvailable) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.emailId = emailId;
        this.classes = classes;
        this.sports = sports;
        this.isAvailable = isAvailable;
    }

    public StudentPojo() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<ClassesPojo> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassesPojo> classes) {
        this.classes = classes;
    }

    public List<SportsPojo> getSports() {
        return sports;
    }

    public void setSports(List<SportsPojo> sports) {
        this.sports = sports;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", emailId='" + emailId + '\'' +
                ", classes=" + classes +
                ", sports=" + sports +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
