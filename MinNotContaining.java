import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MinNotContaining {

    public static int notContains(int[] array) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        Object maxElem = Collections.max(set);

        for(int i = 1; i < (int)maxElem; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }

        return (int)maxElem + 1;


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(notContains(arr));
    }
}
