package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.rangeClosed;

public class Main {
        public static List<Integer> getNumbersUsingIntStreamRange(int a, int b) {
            return IntStream.range(a, b+1)
                    .boxed()
                    .collect(Collectors.toList());
        }

        public static List<Integer> rangeNumber (int a, int b) {
            List<Integer> result = new ArrayList<>();
            for (int i = a; i <= b; i++) {
                result.add(i);
            }
            return result;
        }

    public static int[] between(int a, int b) {
        return rangeClosed(a,b).toArray();
    }

    public static boolean startEnds(String start, String end) {
        return start.endsWith(end);
    }
    public static boolean startWith(String start, String end) {
        return start.startsWith(end);
    }

        public static boolean isogram (String str) {
            str = str.toLowerCase();
            for(int i=0; i < str.length(); i++) {
                for(int b = i+1; b < str.length(); b++) {
                    if(str.toCharArray()[i] == str.toCharArray()[b]){
                        return false;
                    }
                }
            }
            return true;
        }

        public static String prefix(String[] word) {
                if (word.length == 0) return "";
                String prefix = word[0];
                for (int i = 1; i < word.length; i++)
                    while (word[i].indexOf(prefix) != 0) {
                        prefix = prefix.substring(0, prefix.length() - 1);
                        if (prefix.isEmpty()) return "";
                    }
                return prefix;
            }

    public static void main(String[] args) {
        System.out.println(getNumbersUsingIntStreamRange(1, 4));
        System.out.println(rangeNumber(1, 4));
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(isogram("Dermatoglyphics"));
        System.out.println(isogram("moOse"));
        System.out.println(startEnds("abc", "bc"));
        System.out.println(startWith("abc", "ab"));
        System.out.println(prefix(new String[]{"apple", "application", "append"}));
    }
}
