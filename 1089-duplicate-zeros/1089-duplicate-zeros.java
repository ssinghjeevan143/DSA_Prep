class Solution {
    public void duplicateZeros(int[] arr) {
    int n = arr.length;
    int zeros = 0;

    // Count zeros
    for (int num : arr) {
        if (num == 0) zeros++;
    }

    // Traverse backwards
    for (int i = n - 1; i >= 0; i--) {
        if (arr[i] == 0) {
            if (i + zeros < n) arr[i + zeros] = 0;
            zeros--;
            if (i + zeros < n) arr[i + zeros] = 0;
        } else {
            if (i + zeros < n) arr[i + zeros] = arr[i];
        }
    }
}
}