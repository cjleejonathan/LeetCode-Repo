class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for (int cur : nums) {
            sum += cur;
            min = Math.min(min, sum);
        }
        return -min + 1;
    }
}
