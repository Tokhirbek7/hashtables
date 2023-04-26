import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashTableExercises {
    public int mostFrequent() {
        Map<Integer, Integer> map = new HashMap<>();
        int[] items = {1, 2, 2, 3, 3, 3, 4};
        for (int item : items) {
            if (map.containsKey(item)) {
                var count = map.get(item);
                map.put(item, count + 1);
            } else {
                map.put(item, 1);
            }
        }
        Integer max = map.get(items[0]);
        for (int item : items) {
            if (map.get(item) > max)
                max = map.get(item);
        }

        return max;
    }

    public int countPairsWithDiff() {
        int[] items = {1, 7, 5, 9, 2, 12, 3};
        for (int i = 0; i < items.length; i++) {
            for (int j = 1; j < items.length; j++) {
                if (items[i] > items[j]) {
                    int temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        int count = 0;
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = items.length - 1 - 1; j >= 0; j--) {
                if (items[i] - items[j] == 2)
                    count++;
            }
        }
        return count;
    }

    public  int countPairsWithDiffK(int[] arr, int k) {
        HashSet<Integer> uniqueIntegers = new HashSet<>();
        for (int num : arr) {
            uniqueIntegers.add(num);
        }
        int numPairs = 0;
        for (int num : arr) {
            if (uniqueIntegers.contains(num + k)) {
                numPairs++;
            }
        }
        return numPairs;
    }

}
