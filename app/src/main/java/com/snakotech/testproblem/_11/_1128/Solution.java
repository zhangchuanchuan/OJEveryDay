package com.snakotech.testproblem._11._1128;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵：
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 则依次打印出数字
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * Created by Administrator on 2017/11/28.
 */

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int indexY = 0;
        if (m % 2 == 0) {
            indexY = m / 2;
        } else {
            indexY = m / 2 + 1;
        }
        int indexX = 0;
        if (n % 2 == 0) {
            indexX = n / 2;
        } else {
            indexX = n / 2 + 1;
        }

        int sizeX = 0;
        int sizeY = 0;

        int x = 0;
        int y = 0;
        while (true){
            int rightEnd = n - sizeX;
            int leftEnd = sizeX;
            int topEnd = sizeY;
            int bottomEnd = m - sizeY;
            while (x < rightEnd) {
                result.add(matrix[y][x]);
                x++;
            }
            x--;
            y++;
            while (y < bottomEnd) {
                result.add(matrix[y][x]);
                y++;
            }
            y--;
            x--;
            while (x >= leftEnd && y != topEnd) {
                result.add(matrix[y][x]);
                x--;
            }
            x++;
            y--;
            while (y > topEnd && x != rightEnd - 1) {
                result.add(matrix[y][x]);
                y--;
            }
            if (sizeX < indexX) {
                sizeX++;
            }
            if (sizeY < indexY ) {
                sizeY ++;
            }
            if (sizeX == indexX || sizeY == indexY) {
                break;
            }
            x = sizeX;
            y = sizeY;
        }

        return result;
    }
}