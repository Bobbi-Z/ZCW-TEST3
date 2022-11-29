package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder withNthCapitalized = new StringBuilder();
        for (int index = 0; index <str.length(); index++){
            if(index == indexToCapitalize){
                char capitalizeThis = Character.toUpperCase(str.charAt(indexToCapitalize));
                withNthCapitalized.append(capitalizeThis);
            }else{
                withNthCapitalized.append(str.charAt(index));
            }
        }
        return String.valueOf(withNthCapitalized);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (characterToCheckFor == baseString.charAt(indexOfString)){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> stringList = new ArrayList<>();
        for (int index1 = 0; index1 <string.length(); index1++){
            for (int index2 = index1+1; index2 <= string.length(); index2++){
                String subString = string.substring(index1, index2);
                stringList.add(subString);
            }
        }
       List<String> removingduplicates = new ArrayList<>(new LinkedHashSet<>(stringList));

        String [] stringArray = removingduplicates.toArray(new String[0]);

        return stringArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        String [] stringArray = getAllSubStrings(input);
        return stringArray.length;
    }
}
