import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin_973 {
    public static int[][] kClosest(int[][] points, int K) {
        if(K>=points.length) return points;
        PriorityQueue<int[]> heap=new PriorityQueue<>(new Comparator<int[]>(){public int compare(int[] p1, int[] p2){return (p1[0]*p1[0])+(p1[1]*p1[1])-(p2[0]*p2[0])-(p2[1]*p2[1]);}});
        for(int[] point:points) heap.offer(point);
        int[][] result=new int[K][2];
        for(int i=0;i<K;i++) result[i]=heap.poll();
        return result;
    }
}
