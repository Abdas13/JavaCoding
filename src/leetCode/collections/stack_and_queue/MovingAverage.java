package leetCode.collections.stack_and_queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class MovingAverage {
    static int size;
    static Deque window = new ArrayDeque<Integer>();
    static int sum = 0;
    public MovingAverage(int size) {
        this.size = size;

    }

    public static void main(String[] args) {

    }
    public static double next(int value){
        window.add(value);
        int first = window.size() > size ? (int) window.poll() : 0;

        sum += value - first;
         return 1.0 * sum / window.size();
    }
}
