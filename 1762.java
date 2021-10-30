class Solution {
    public int[] findBuildings(int[] heights) {
        int len = heights.length;
        if (len == 1)
            return new int[]{0};
        
        List<Integer> list = new ArrayList<>();
        list.add(len - 1);
        int tallestSoFar = heights[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if(heights[i] > tallestSoFar) {
                list.add(i);
                tallestSoFar = heights[i];
            }
        }
        int[] res = new int[list.size()];
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            res[count++] = list.get(i);
        }
        return res;
    }
}
