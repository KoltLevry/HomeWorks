package homework_40.task_3;

/* Task 3. Опционально
    Написать метод, возвращающий первый неповторяющийся символ в строке

    public static void main(String[] args) {
            String string = "abcdefj ab,cdf,";
            System.out.println(StrUtil.getFirstUniqueChar(string));
        }
        //Output:
        e
 */

import java.util.*;

public class StrUtil {

    public static String getFirstUniqueChar(String str) {
        String[] resultSplit = str.split("");

        List<String> uniqueChars = new ArrayList<>(Arrays.asList(resultSplit));

        uniqueChars.removeIf(uniqueChar -> Collections.frequency(uniqueChars, uniqueChar) > 1);

        return uniqueChars.getFirst();
    }

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println("My string: [ " + string + " ]");
        System.out.println("First unique char in the string: [ " + StrUtil.getFirstUniqueChar(string) + " ]");
    }

}
