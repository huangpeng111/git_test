package test;

import java.util.Arrays;

/**
 * 插入排序
 * @author 000
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		Integer[] arr = ArrayUtil.getIntegerArray();
		System.out.println("排序前"+Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			int preIndex = i;
			int current = arr[i+1];
			while(preIndex>=0&&current<arr[preIndex]) {
				arr[preIndex+1]=arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1] = current;
		}
		System.out.println("insertSort:"+Arrays.toString(arr));
	}
}
