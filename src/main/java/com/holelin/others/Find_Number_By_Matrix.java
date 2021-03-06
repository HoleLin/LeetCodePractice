package com.holelin.others;

/**
 * ClassName: Find_Number_By_Matrix
 * 【题目】
 * 给定一个有N*M的整型矩阵matrix和一个整数K，matrix的每一行和每一
 * 列都是排好序的。实现一个函数，判断K是否在matrix中。
 * 例如：
 * 0 1 2 5
 * 2 3 4 7
 * 4 4 4 8
 * 5 7 7 9
 * 如果K为7，返回true；如果K为6，返回false。
 * 【要求】
 * 时间复杂度为O(N+M)，额外空间复杂度为O(1)。
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/3/10
 */

public class Find_Number_By_Matrix {

	public static boolean isContains(int[][] matrix, int k) {
		// 确定坐标从矩阵的右上角开始找
		int row = 0;
		int col = matrix[0].length - 1;
		while (row < matrix.length && col > -1) {
			if (matrix[row][col] == k) {
				return true;
			} else if (matrix[row][col] < k) {
				// 当前数小于k row++
				// 因为行列有序  左边的数都小于matrix[row][col],下边的数都大于matrix[row][col]
				row++;
			} else {
				col--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{{0, 1, 2, 3, 4, 5, 6},
				{10, 12, 13, 15, 16, 17, 18},
				{23, 24, 25, 26, 27, 28, 29},
				{44, 45, 46, 47, 48, 49, 50},
				{65, 66, 67, 68, 69, 70, 71},
				{96, 97, 98, 99, 100, 111, 122},
				{166, 176, 186, 187, 190, 195, 200},
				{233, 243, 321, 341, 356, 370, 380}
		};
		int K = 233;
		System.out.println(isContains(matrix, K));
	}
}
