package rocks.zipcode.io.assessment4.fundamentals;

import com.sun.applet2.Applet2;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(word);
        if (!matcher.find()){
            return -1;
        }
        return matcher.start();
    }


    public static Boolean startsWithVowel(String word) {
        if (getIndexOfFirstVowel(word) != 0){
            return false;
        }
        return true;
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(String.valueOf(character));
    }
}
