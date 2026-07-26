class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s= new Stack<>();
        int[] right= new int[heights.length];
        int[] left= new int[heights.length];
        for(int i=heights.length-1; i>=0; i--){

            while(s.size()>0 && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            right[i]= s.isEmpty() ? heights.length : s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=0; i<heights.length; i++){

            while(s.size()>0 && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            left[i]= s.isEmpty() ? -1: s.peek();
            s.push(i);
        }
        int maxArea= 0;
        for(int i=0; i<heights.length; i++){
            int currArea= heights[i]* (right[i]-left[i]-1);
            maxArea= Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}