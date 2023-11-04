package hackerrank.strings;

public class TimeConvert {
    public static void main(String[] args) {
        String s = "12:03:00PM";
        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) {
        // Write your code here

        String ampm = s.substring(s.length()-2);
        String result="";

        if(ampm.equalsIgnoreCase("PM") && s.substring(0,2).equals("12")){
            result+="00"+s.substring(2, s.length()-2);
        }else if(ampm.equalsIgnoreCase("PM") && Integer.parseInt(s.substring(0,2))<12) {
            result+= (Integer.parseInt(s.substring(0,2))+12)+s.substring(2, s.length()-2);
        } else {
            result+=s.substring(0,s.length()-2);
        }
        return result;
    }
}
