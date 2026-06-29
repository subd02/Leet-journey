class Solution {
    public int search(int[] nums, int target) {
        int st= 0;
        int end= nums.length-1;
        while(st<=end){
            int mid= st + ((end-st)/2);
            if(nums[mid]==target){
                return mid;
            }

            //check which is sorted
            if(nums[st]<=nums[mid]){ //left sorted

            if(nums[st]<=target && target<=nums[mid]){ //target in left
                end= mid-1;
            }else { //target in right
                st= mid+1;
            }

            }else{ //right sorted
                if(nums[mid]<=target && target<=nums[end]){ //target in right
                st= mid+1;
            }else { //target in left
                end= mid-1;
            }
            }
        }
        return  -1;
    }
}