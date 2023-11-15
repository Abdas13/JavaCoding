package hackerrank.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EncryptedAlphabet {


    public static void main(String[] args) {
        String s = "hbcd-xh-Rt'-zx";
        int k=3;
        System.out.println(s);
        System.out.println(caesarCipher(s, k));
        System.out.println(ceaserCipher2(s,k));
    }
    public static String caesarCipher(String s, int k) {
        char[] chs = s.toCharArray(); // [k, e, f, g, -, a, k, -, U, w, ', -, c, a]

        for(int i=0 ;i< chs.length; i++ ){
            char c = chs[i];
            if(Character.isLetter(c)){  // true
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char rotatedChar =(char) (base+(c-base +k) % 26);     //  base ='a'  c='d'
                chs[i]=rotatedChar;
            }
        }
        System.out.println(Arrays.toString(chs));
        return new String(chs);

    }
    public static String ceaserCipher2(String s, int k){
//        String str = "abhfxyd";    // 'a'= 97, 'z'=122
//        String output ="dekiabg";
//        char[] ch = s.toCharArray();
//
//        for (int i = 0; i < ch.length; i++) {
//            if(Character.isLetter(ch[i]))
//                ch[i] = (char) (ch[i] + k);
//        }
//        for (int i = ch.length-k; i < ch.length; i++) {
//            if(Character.isLetter(ch[i]))
//                ch[i] = (char) (ch[i] - 26 + k);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < ch.length; i++) {
//            sb.append(ch[i]);
//        }
//        return sb.toString();
        return null;
    }
}
