package lovebabbar;

import java.util.*;

public class waterjug {
    public static void main(String[] args) {
        int jug1capacity=3;
        int jug2capacity=5;
        int targetcapacity=4;
        System.out.println(jug(jug1capacity,jug2capacity,targetcapacity));
}
    static boolean jug(int x,int y,int z){
        if ((x+y) < z){
            return false;
        }
        int[] directions={x,-x,y,-y};
        Queue <Integer> q=new ArrayDeque<>();
        Set<Integer> set=new HashSet<>();
        q.offer(0);
        set.add(0);
        while (!q.isEmpty()){
            int curr=q.poll();
            if (curr==z){
                return true;
            }
            for (int direction:directions){
                int total=curr+direction;
                if (total==z){
                    return  true;
                }
                if (total < 0 || total > (x+y))
                {
                    continue;
                }
                if (!set.contains(total)){
                    set.add(total);
                    q.offer(total);
                }
            }
        }
        return false;
    }
}
