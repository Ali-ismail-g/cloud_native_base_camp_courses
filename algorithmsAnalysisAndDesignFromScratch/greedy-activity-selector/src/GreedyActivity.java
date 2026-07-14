import java.util.ArrayList;
import java.util.List;

public class GreedyActivity {
    public static List<Integer> greedy(int[] s, int[] e){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        if(s.length != e.length) return null;
        int j=0;
        int i=1;
        for(;i< s.length;i++){
            if(s[i]>=e[j]){
                j=i;
                result.add(i);
            }
        }
        return result;
    }
}
