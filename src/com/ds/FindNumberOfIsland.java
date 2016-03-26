package com.ds;

import static com.dynamic.ReadMultiDimensionalArray.*;
import static java.lang.System.*;

/*
 One complex problem is divided into multiple sub problems.Each sub problems are sovled and stored in the memory in any form 
 of data structure and again when any similar problem comes we can just look into the memory. Hence lot of 
 compilation time will be saved. This is what called as Dynamic Programming.

 Inorder-Left Root Right (Will be sorted in acending order)
 Preorder-Root Left Right
 Postorder-Left Right Root


 Tree traversal:
 -Breadth-first(Level order)(Breadth or level first all elements in one level traversal is over then it will go to the next level traversal)
 -Depth-first we can traverse (root then left sub tree and right sub tree) or (left sub tree then root then rigth sub trre) or
 (left sub tree  then rigth sub tree then root)
 DPT - Pre order Post order In order traversal will happen
 */
public class FindNumberOfIsland {
	// Find if the node or index is present
	// Implementation of DFS
	// Find the number of Islands
	static Boolean isNodePresent(Integer[][] arr, Integer i, Integer j,
			Boolean[][] visited) {
		// node value should be zero
		// node should b inside the matrix
		if (i >= 0 && j >= 0 && i < arr[0].length && j < arr[0].length
				&& arr[i][j] == 1) {
			arr[i][j] = 0;
			return true;
		} else
			return false;
	}

	static void DFS(Integer[][] arr, Integer i, Integer j, Boolean[][] visited) {
		Integer[] rowVal = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
		Integer[] colVal = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
		visited[i][j] = true;
		for (int ii = 0; ii < rowVal.length; ii++) {
			if (isNodePresent(arr, i + rowVal[ii], j + colVal[ii], visited)) {
				DFS(arr, i + rowVal[ii], j + colVal[ii], visited);
			}
		}
	}

	static Integer numberOfIslands(Integer[][] arr, int row, int col) {
		Boolean[][] visited = new Boolean[row][col];
		int count = 0;
		for (Integer i = 0; i < row; i++) {
			for (Integer j = 0; j < row; j++) {
				if (arr[i][j] == 1) {
					DFS(arr, i, j, visited);
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String... cla) {
		// new ReadMultiDimensionalArray().
		Integer[][] arr = readArrayInt();
		out.println("The Number of islands:  "
				+ numberOfIslands(arr, arr[0].length, arr[0].length));
	}
}
