package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    Map<String, String> abbr;

    public Abbreviations(){
        abbr = new HashMap<>();

    }
    public static void main(String[] args) {
       /*create a class Abbreviations for managing abbreviations.
       The class must have a constructor with no parameters.And provide followings

       public void addAbbreviation(String abbreviation, String explanation) ==> add abbreviation and its explanation
       public boolean hasAbbreviation(String abbreviation) checks if any abbreviation has already been added.
       public findExplanationFor(String abbreviation) finds the explanation for an abbreviation, returns null if the abbreviation has not been added.
        */

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol.";


        for (String part:text.split(" ")){
            if (abbreviations.hasAbbreviation(part)){
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbr.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return abbr.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        return abbr.get(abbreviation);
    }

}
