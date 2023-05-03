package challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabethPattern {
    public static void main(String[] args) {
//        /*
//        A
//        B B
//        C C C
//        D D D D
//         */
//        //A-Z:65 to 90
//        //a-z:97 to 122
//        int alpha=65;
//        for(int i=0;i<=5;i++){
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char)alpha+" ");
//            }
//            alpha++;
//            System.out.println();
//        }
//        if(System.out.append("Hello World")==null){
//        }
//        System.out.println((int)'c');
        String tellMe="My name is Abdurrahman AS," +
                " I have worked on UI and API testing using both manuel and automation." +
                " I am good at Core Java, Selenium WebDriver, Maven, Cucumber, JUnit,TestNG, Postman and RestAssured.";
        ArrayList<Character>list=new ArrayList<>();
        ArrayList<String >list1=new ArrayList<>();

        for (int i = 97; i <122 ; i++) {

            list.add((char) i);
        }
        String str=tellMe.toLowerCase().replaceAll(" ","");
        System.out.println(str);
        String [] strNew=str.replaceAll(",","").split("");

        for (int i = 0; i < strNew.length; i++) {
            list1.add(strNew[i]);



        }








    }
}
