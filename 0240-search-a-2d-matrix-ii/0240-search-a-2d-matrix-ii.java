class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int r=0;
        int c= n-1;

        while(c>=0 && r<m){
            int mid= matrix[r][c];
            if(target==mid){
                return true;
            }
            if(target<mid){
                c--;
            }
            if(target>mid){
                r++;
            }
        }
        return false;
    }
}