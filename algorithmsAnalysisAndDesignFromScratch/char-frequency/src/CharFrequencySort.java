import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharFrequencySort {
    record CharFreq(char ch, int freq) {}
    public static List<CharFreq> getSortedFrequencies(String input, boolean ignoreSpaces) {
        if (input == null) throw new IllegalArgumentException("Input cannot be null");

        Map<Character, Integer> freqTable = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (ignoreSpaces && c == ' ') continue;
            freqTable.merge(c, 1, Integer::sum);
        }

        CharFreq[] arr = freqTable.entrySet().stream()
                .map(e -> new CharFreq(e.getKey(), e.getValue()))
                .toArray(CharFreq[]::new);

        mergeSort(arr, 0, arr.length - 1);
        return Arrays.asList(arr);
    }

    private static void mergeSort(CharFreq[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(CharFreq[] arr, int left, int mid, int right) {
        CharFreq[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        CharFreq[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < leftArr.length && j < rightArr.length) {
            arr[k++] = (leftArr[i].freq() >= rightArr[j].freq()) ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        List<CharFreq> result = getSortedFrequencies("programming", true);
        result.forEach(cf -> System.out.println(cf.ch() + " : " + cf.freq()));
    }
}
