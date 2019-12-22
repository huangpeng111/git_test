package test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 选择排序
 * @author 000
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		Integer[] array = ArrayUtil.getIntegerArray();
		System.out.println("排序前:"+Arrays.toString(array));
		for(int i =0 ;i< array.length-1 ; i++) {
			for (int j = i+1 ; j<array.length ;j++) {
				if(array[i] > array [j]) {
					array[i] =array[i]+array[j];
					array[j] = array[i]-array[j];
					array[i] = array[i]-array[j];
				}
			}
		}
		System.out.println("selectionSort:"+Arrays.toString(array));
	}

}
