package tricks;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "235";
        int i;
        Integer integer;

        i = Integer.parseInt(str);
        System.out.println(i+5);

        try {
            integer = Integer.valueOf(str);
        }catch (NumberFormatException e){
            integer=0;
        }
        System.out.println(integer+3);


    }
}
