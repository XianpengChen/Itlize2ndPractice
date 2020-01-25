 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
         for (String str : array) {
             if (str.equals(value)) {
                 return true;
             }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            result[array.length - 1 - i] = array[i];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = array.length - 1; i>= 0; i--) {
            if (!array[i].equals(array[array.length - 1 - i])){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String total = "";
        for (String str: array) {
            total = total + str;
        }
        total = total.toLowerCase();
        for (int i = 97; i <= 122; i++) {
            char temp = (char) (i);
            if (!total.contains(Character.toString(temp))) {
            return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String str: array) {
        if (str.equals(value)) {
            counter += 1;
        }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> result = new ArrayList<String>();
        for (String str: array) {
            if (!str.equals(valueToRemove)) {
                result.add(str);
            }
        }
        String[] finalResult = new String[result.size()];
        finalResult = result.toArray(finalResult);
        return finalResult;
            
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> temp = Arrays.asList(array);
        List<String> copy = new ArrayList<>();
        copy.add(temp.get(0));
        for (int i = 1; i < temp.size(); i++) {
            if (!temp.get(i-1).equals(temp.get(i))) {
                copy.add(temp.get(i));
            }
        }
        String[] result = new String[copy.size()];
        result = copy.toArray(result);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> temp = Arrays.asList(array);
        List<String> copy = new ArrayList<>();
        String iterator = "";
        String packed = "";
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).equals(iterator)) {
                packed = iterator + packed;
                copy.set(copy.size() -1, packed);
            }
            else {
                iterator = temp.get(i);
                copy.add(iterator);
                packed = temp.get(i);
            }
        }
        String[] result = new String[copy.size()];
        result = copy.toArray(result);
        return result;
        
    }


}
