class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }
            result.add(Arrays.asList(start, end));
            i++;
        }
        int[][] ans = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            ans[j][0] = result.get(j).get(0);
            ans[j][1] = result.get(j).get(1);
        }
        return ans;
    }
}