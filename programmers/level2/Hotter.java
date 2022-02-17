package programmers.level2;

import java.util.*;

public class Hotter {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            heap.add(scoville[i]);
        }

        while(heap.peek() < K){
            if(heap.size() < 2) {
                return -1;
            }
            int a1 = heap.poll();
            int a2 = heap.poll();

            int newFood = a1 + (a2 * 2);
            heap.offer(newFood);
            answer++;
        }
        return answer;
    }

}
