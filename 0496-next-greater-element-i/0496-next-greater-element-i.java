class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s= new Stack<>();
        int nextGreater= 0;
        for(int i=nums2.length-1; i>=0; i--){

            while(s.size()>0 && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nextGreater=-1;
            }else{
                nextGreater= s.peek();
            }
            map.put(nums2[i], nextGreater);
            s.push(nums2[i]);
        }
        int[] res= new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i]= map.get(nums1[i]);
        }

        return res;
    }
}