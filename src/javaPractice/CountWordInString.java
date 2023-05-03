package javaPractice;

public class CountWordInString {
    public static void main(String[] args) {

        String str="Java is funny. Java makes challenge, javascript is easier than java";

        String[] str1=str.toLowerCase().replace(".","").split(" ");
        int count=0;

        for (String each:str1) {
            if(each.contains("java")){
                count++;
            }
        }
        System.out.println(count);
        }
    }

