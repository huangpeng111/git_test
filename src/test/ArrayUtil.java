package test;

import java.util.Random;


/**
 * 得到随机数组
 * @author 000
 *
 */
public class ArrayUtil {
	private static int minLength = 8 ;
	private static int maxNumber = 500 ;
	public static Integer[] getIntegerArray() {
		Integer[] array = new Integer[minLength+new Random().nextInt(10)];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(500);
		}
		return array;
	}
}
