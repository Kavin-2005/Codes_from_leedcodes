class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int first=0;
	while(first<nums1.length) {
		for(int i=0; i<nums2.length; i++) {
			if(nums2[i]==nums1[first]) {
			    int ans=-1;
				for(int j=i+1; j<nums2.length; j++) {
					if(nums1[first]<nums2[j]) {
						ans=nums2[j];
						break;
					}
				}
				nums1[first]=ans;
				first++;
                break;
			}
		
		}
	}
	return nums1;
}}
//or 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int first = 0;

        while(first < nums1.length){

            int i;
            for(i = 0; i < nums2.length; i++){
                if(nums2[i] == nums1[first]){
                    break;
                }
            }

            int ans = -1;

            for(int j = i + 1; j < nums2.length; j++){
                if(nums2[j] > nums1[first]){
                    ans = nums2[j];
                    break;
                }
            }

            nums1[first] = ans;
            first++;
        }

        return nums1;
    }
}
