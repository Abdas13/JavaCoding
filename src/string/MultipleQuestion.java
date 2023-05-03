package string;

import java.util.Scanner;

public class MultipleQuestion {
    public static void main(String[] args) {

		/*

		  Ask use to enter first name and last name under given conditions;

            1)If user uses space characters at the beginning or at the end remove them.
            2)If user enters nothing or just space character, give a message like
              "Just space characters or nothing is not valid"
            3)If user does not use space character between first and last name
              give a message like "One of the last name and first name is not entered
              or space is not used between first name and last name"
            4)If user uses multiple space characters between first name and last name
              make it single.
            5)Initials of first name and last name should be upper case,
              other characters should be lower cases.
              If user does not enter the name in this format fix it.

		 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first and last name..");
        String name = scan.nextLine();

		/*
		 Note: Just by using String methods, you cannot change the original String.
			   Strings are "immutable"
			   If you want to change original String , you need to assign it.
		*/

        //1.Step:
        name = name.trim();
        //System.out.println("After:" + name);

        //2.Step:
        if(name.isBlank()) {
            System.out.println("Just space characters or nothing is not valid");
        }

        //3.Step:
        if(!name.contains(" ")) {
            System.out.println("One of the lastname and firstname is not entered or space is not used between firstname and lastname");
        }

        //4.Step:
        if(name.indexOf(" ")!=name.lastIndexOf(" ")) {

            int firstIdx = name.indexOf(" ");
            int lastIdx = name.lastIndexOf(" ");
            name = name.substring(0, firstIdx) + " " + name.substring(lastIdx+1);
            //System.out.println(name);
        }

        // 5)

		/*
		 When you create a variable between curly braces{}, it can be used only inside it.
		 if you try to use it outside of it, JAVA will give Compile Time Error.
		 This is called "SCOPE" in JAVA.
		 */


        int idxOfSpace = name.indexOf(" ");
        String firstNameFormatted = "";
        String lastNameFormatted = "";

        if(idxOfSpace!=-1) {
            firstNameFormatted = name.substring(0, 1).toUpperCase() + name.substring(1, idxOfSpace).toLowerCase();
            lastNameFormatted = name.substring(idxOfSpace + 1, idxOfSpace + 2).toUpperCase() + name.substring(idxOfSpace + 2).toLowerCase();
        }
        name = firstNameFormatted + " " + lastNameFormatted;

        System.out.println(name);





    }
}
