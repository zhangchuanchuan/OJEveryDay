package com.snakotech.testproblem._11;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * Created by Administrator on 2017/11/8.
 */

public class _1108 {
    public static void mainTest() {
        int[] source = new int[]{12,53,23,2,4,5,6,4,3,4,5,4,5,8,0,7,6};
        System.out.println(Arrays.toString(getMaxWindowArray(source, 4)));
        System.out.println(Arrays.toString(getMaxWindowArray1(source, 4)));
    }

    //普通的算法，时间复杂度n*w
    public static int[] getMaxWindowArray(int[] array, int size) {
        int sLength = array.length;
        int rLength = sLength - size + 1;
        int[] result = new int[rLength];
        for (int i=0; i < rLength; i++) {
            int max = array[i];
            for (int j=1; j < size; j++) {
                if (max < array[i + j]) {
                    max = array[i+j];
                }
            }
            result[i] = max;
        }
        return result;
    }

    //时间复杂度n
    public static int[] getMaxWindowArray1(int[] array, int size) {
        int sLength = array.length;
        int rLength = sLength - size + 1;
        int[] result = new int[rLength];

        Deque<Integer> deque = new LinkedList<>();
        for (int i=0; i < sLength; i++) {

            if (!deque.isEmpty()) {
                //查看队列头是否被淘汰了
                Integer headIndex = deque.getFirst();
                if (i - headIndex >= size) {
                    deque.removeFirst();
                    System.out.println("淘汰过期的队列头：" + headIndex + ", now:" + deque);
                }

                //新元素与队尾比较
                Integer lastIndex = deque.getLast();
                while (!deque.isEmpty() && array[lastIndex] <= array[i]) {
                    deque.removeLast();
                    System.out.println("移除队尾索引：" +  lastIndex + ", "+ deque);
                    if (!deque.isEmpty()) {
                        lastIndex = deque.getLast();
                    }
                }
                deque.add(i);
                System.out.println("添加新元素到队尾" +  i + ", "+ deque);
                int index = i + 1 - size;
                if (index >= 0) {
                    result[index] = array[deque.getFirst()];
                }
            } else {
                deque.add(i);
                System.out.println("初始化添加" + i + ", " + deque);
            }

        }
        return result;
    }
}
