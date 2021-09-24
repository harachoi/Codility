class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) return  A;
        int[] result = new int[A.length];

        int start = K % A.length;
        int idx = start;
        int id = 0;

        for (int i = start; i < start +A.length; i++) {
            if (idx == A.length)
                idx = 0;

            result[idx] = A[id++];
            idx++;
        }
        return result;
    }
}
