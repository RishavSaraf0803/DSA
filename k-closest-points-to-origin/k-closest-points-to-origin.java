class Solution {
    public int[][] kClosest(int[][] points, int k) {
       
        //logic
        Arrays.sort(points,((a,b)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])));
      
        //Result Making
    
        return Arrays.copyOf(points,k);
    }
}