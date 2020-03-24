package Lab2Package;

public class PrintNumber {

	public void findNum(int arr[]) {
		int temp[] = new int[21];
		for (int i : arr) {
			temp[i]++;
			if (temp[i] == 2) {
				System.out.println("the number found : " + i);
				return;
			}
		}
		System.out.println("no number found");
	}
}
