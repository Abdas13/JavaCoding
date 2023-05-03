package leetCode.strings;

public class CountCharsAndWrite {
    public static void main(String[] args) {
        String str = "aabcccddaaaac";
        //output=a2b1c3d2a4
        System.out.println(countChars(str).toString());
        System.out.println(countandWrite(str));
    }
    public static StringBuilder countChars(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.split("");
        int counter = 0;
        String previous = "";
        for (String each : s) {
            if (!each.equals(previous)) {
                if (counter != 0) {
                    sb.append(previous).append(counter);
                }
                counter = 1;
                previous = each;
            } else {
                counter++;
            }
        }
        return sb.append(previous).append(counter);
    }

    public static StringBuilder countandWrite(String input) {
        // String str = "aabcccddaaaac"
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int left = 0;
        for (int right = 0; right < input.length(); right++) {
            if (input.charAt(left) == input.charAt(right)) {
                count++;
            } else {
                sb.append(input.charAt(left)).append(count);
                left = right;
                count = 1;
            }
        }
        return sb.append(input.charAt(left)).append(count);
    }
}
