import java.util.*;

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                set.remove(i);
            } else
                set.add(i);
        }
        Iterator itr = set.iterator();
        return (int) itr.next();
    }
}
