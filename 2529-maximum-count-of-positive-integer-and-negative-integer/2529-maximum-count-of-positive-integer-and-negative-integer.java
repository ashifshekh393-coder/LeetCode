class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;

        // First non-negative element
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        int ngcount = lo;

        // First positive element
        lo = 0;
        hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] <= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        int pocount = n - lo;

        return Math.max(ngcount, pocount);
    }
}