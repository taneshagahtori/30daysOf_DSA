class Solution {
    public int findContentChildren(int[] childrenGreed, int[] cookieSizes) {
        Arrays.sort(childrenGreed);
        Arrays.sort(cookieSizes);
        int i = 0;
        int j = 0;
        while (j < cookieSizes.length && i < childrenGreed.length) {
            if (cookieSizes[j] >= childrenGreed[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}