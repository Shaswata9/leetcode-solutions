class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> arr = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] res = new int[arr.size()];
        for (int p = 0; p < arr.size(); p++) {
            res[p] = arr.get(p);
        }
        return res;
    }
}