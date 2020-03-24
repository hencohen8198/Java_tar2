package Lab2Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lab2Class {

	public static void main(String[] args) {

		int temp;
		int arr[] = new int[21];
		for (int i = 0; i < 21; i++) {
			arr[i] = i;
		}
		Random random = new Random();
		while (true) {
			temp = random.nextInt();
			if (temp < 21 && temp > 0) {
				arr[temp] = temp - 1;
				break;
			}
		}
		List<Integer> arrL = new ArrayList<Integer>();
		for (int integer : arr) {
			arrL.add(new Integer(integer));
		}
		System.out.println(arrL.toString());
		PrintNumber printNumber = new PrintNumber();
		printNumber.findNum(arr);
	}
}
