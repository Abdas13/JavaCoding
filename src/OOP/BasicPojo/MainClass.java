package OOP.BasicPojo;

import java.util.HashMap;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        ExamsPojo examsPojo1 = new ExamsPojo(73.0, 85.5, 90.0);

        ClassesPojo classesPojo=new ClassesPojo("Math1","Physics1","Biology1","English", (List<ExamsPojo>) examsPojo1);

        SportsPojo sportsPojo = new SportsPojo();

        StudentPojo studentPojo = new StudentPojo("ali","jan",23,"aaa@bbb.com", (List<ClassesPojo>) classesPojo, (List<SportsPojo>) sportsPojo,true);


    }
}
