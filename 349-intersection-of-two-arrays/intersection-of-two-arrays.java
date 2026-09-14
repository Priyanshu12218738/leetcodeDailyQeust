class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> same = new HashSet<>();

        //add element in the set
        for(int num : nums1){
            set.add(num);

        }

        // check for element in the second array and save it to same set.
        for(int num: nums2){
            if(set.contains(num)){
                same.add(num);

            }
        }

        // store same result in  array
        int[] result = new int[same.size()];
        
        int index = 0;
        for(int num : same){
            result[index++] = num;
        }
        
        return result;
    }
}