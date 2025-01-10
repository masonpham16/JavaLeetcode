class Solution {
    public int mySqrt(int x) {

        if (x == 0){
            return 0;
        }
        if (x == 1){
            return 1;
        }

        // do binary search to find the right sqrt
        int first = 0;
        int last = x;
        int result = 0;;



        while (first <= last) {
            int middle = first + (last - first) / 2;
            long square = (long) middle*middle; // use long to prevent overflow
            if (square == x) {
                return middle;
            } else if (square < x) {
                result = middle;
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        return result;
    }
}
