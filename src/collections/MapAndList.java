package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.List.of;

public class MapAndList {
    // ogrenci numarasi - {Mathematic, Physics,  ... aldigi dersler}
    // 11101 - {Mathematic, Physics}
    // ogrenci no girildiginde, Aldigi dersleri gostersin

    // iki tane ogrenci numarasi gonderdiginde, ortak derleri yazdirsin

    //1 - )
    public static void main(String[] args) {
        //  printTheStudent("11103");
        printOrtakDers("11102", "11103");
    }


    // ogrenci derlerini kayit tutuldugu method
    public static Map<String, List<String>> classOfStudents() {
        Map<String, List<String>> students = new HashMap<>();
        students.put("11101", List.of("Math", "Music"));
        students.put("11102", List.of("Chemistry", "Music", "Computer"));
        students.put("11103", List.of("Computer", "Math", "English"));
        return students;
    }


    // ogrenci no girildiginde, Aldigi dersleri gostersin
    public static void printTheStudent(String studentNumber) {
        Map<String, List<String>> allStudents = classOfStudents();
        System.err.println(allStudents.get(studentNumber));
    }


    public static void printOrtakDers(String student1Number, String student2Number) {
        Map<String, List<String>> allStudents = classOfStudents();
        List<String> student1 = allStudents.get(student1Number);
        List<String> student2 = allStudents.get(student2Number);

        for (String eachStudentCourse : student1) {
            if (student2.contains(eachStudentCourse)) {
                System.err.println(eachStudentCourse);
            }
        }
    }
}
