class Solution {
    public int findComplement(int num) {
        int todo = num, bit = 1;
        while (todo != 0) {
            num = num ^ bit;
            bit = bit << 1;
            todo = todo >> 1;
        }
        return num;
    }
}
