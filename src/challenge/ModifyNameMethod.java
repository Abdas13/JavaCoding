package challenge;

public class ModifyNameMethod {
    public static void main(String[] args) {
        String name="AHMET";
        String lastname="KALIN";

        String fullName= modifyFullName(name,lastname);
        System.out.println("input name and lastname :"+name+" "+lastname);
        System.out.println("After modifying name and lastname :"+modifyFullName(name,lastname));
    }

    private static String modifyFullName(String name, String lastname) {
        String modifiedName=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        String modifiedLastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        return modifiedName+" "+modifiedLastname;

    }
}
