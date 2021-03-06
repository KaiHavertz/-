package 大宋;

import java.util.Arrays;

public class BubbleSortBuilder {
	
	/**
	 * 冒泡排序 Java实现
	 * 冒泡排序的思想就是将相邻的两个位置的数据进行比较,如果前面位置的数据大于后面位置的数据,则将两位置的数据进行交换,未排序元素中最大的数便会像一个气泡一样一路向后冒,最后会将其放在未排序数据的末尾.使其成为已排序数据的首位,时间复杂度O(n^2),空间复杂度O(1)
	 */
	
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
