class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        double[][] pointWithDistance = new double[points.length][3];
        for(int i =0; i < points.length; i++){
            pointWithDistance[i][0] = points[i][0];
            pointWithDistance[i][1] = points[i][1];
            pointWithDistance[i][2] = Math.pow(points[i][0]*points[i][0] + points[i][1]*points[i][1],0.5);
        }
        Arrays.sort(pointWithDistance,(a,b)->Double.compare(a[2],b[2]));
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            result[i][0] =(int) pointWithDistance[i][0];
            result[i][1] = (int)pointWithDistance[i][1];
        }
        return result;
    }
}