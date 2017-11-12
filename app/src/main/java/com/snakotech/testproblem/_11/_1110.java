package com.snakotech.testproblem._11;

/**
 * 11月10日
 * Created by Administrator on 2017/11/11.
 */

public class _1110 {
    /**
     * 杨氏矩阵求目标是否存在
     * 问题：已知一个2维矩阵，其中的元素每一行从左至右依次增加，每一列从上到下依次增加。
     * 即对于矩阵Table有Table[i][j] ≤Table[i][j + 1], Table[i][j] ≤ Table[i + 1][j]，
     * 我们也称这样的矩阵为杨氏矩阵。给出判定某个数是否存在该矩阵中的高效算法。
     */
    public static void testMain() {
        int[][] array = new int[][]{
                {1, 4, 7, 11,15},
                {2, 5, 8, 12,19},
                {3, 6, 9, 16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        System.out.println(search2Array(array, 14));
        System.out.println(search2Array2(array, 14));
        System.out.println(search2Array3(array, 14));
        System.out.println(search2Array(array, 7));
        System.out.println(search2Array2(array, 7));
        System.out.println(search2Array3(array, 7));
        System.out.println(search2Array(array, 13));
        System.out.println(search2Array2(array, 13));
        System.out.println(search2Array3(array, 13));

    }

    /**
     * 简单的解决方案，遍历搜索。时间复杂度n*n
     * @param array
     * @param target
     * @return
     */
    public static boolean search2Array(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int n = array.length;
        if (n == 0) {
            return false;
        }
        int m = array[0].length;

        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if (j == 0) {
                    if (array[i][j] > target) {
                        return false;
                    } else if (array[i][j] == target) {
                        System.out.println("result:" + i + ", " + j);
                        return true;
                    }
                } else {
                    if (array[i][j] > target) {
                        break;
                    } else if (array[i][j] == target) {
                        System.out.println("result:" + i + ", " + j);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 第一列遍历，嵌套循环使用二分法。时间复杂度n*log(n)
     * @return
     */
    public static boolean search2Array2(int[][] array, int target) {

        if (array == null) {
            return false;
        }
        int n = array.length;
        if (n == 0) {
            return false;
        }
        int m = array[0].length;

        for (int i=0; i < n; i++) {
            int index = m / 2;
            int left = 0;
            int right = m;
            while (true) {
                if (array[i][index] == target) {
                    System.out.println("2 result:" + i + ", " + index);
                    return true;
                } else if (array[i][index] > target) {
                    right = index;
                    index = (left + index) / 2;
                    if (left == index) {
                        break;
                    }
                } else {
                    left = index;
                    index = (right + index) / 2;
                    if (right == index) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    /**
     * step-wise线性搜索算法。右上角开始搜索，大于往下搜，小于左搜。
     * 时间复杂度O(n)
     * @return
     */
    public static boolean search2Array3(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int n = array.length;
        if (n == 0) {
            return false;
        }
        int m = array[0].length;

        int x = n - 1;
        int y = 0;
        while (x >=0 && y <= m) {
            if (array[x][y] == target) {
                System.out.println("3 result:" + x + ", " + y);
                return true;
            } else if (array[x][y] > target) {
                x --;
            } else {
                y ++;
            }
        }
        return false;
    }



}
