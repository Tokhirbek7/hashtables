import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = insertCharactersIntoMap(str);
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1)
                return c;
        }
        return Character.MIN_VALUE;
    }

    private static Map<Character, Integer> insertCharactersIntoMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (var ch : str.toCharArray()) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        return map;
    }

    public char findFirstRepeatedChar(String str) {
        Map<Character, Integer> map = insertCharactersIntoMap(str);
        for (char c : str.toCharArray()) {
            if (map.get(c) > 1)
                return c;
        }
        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar2(String str){
        Set<Character> characters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (characters.contains(c)){
                return c;
            }
            characters.add(c);
        }
        return Character.MIN_VALUE;
    }


}
