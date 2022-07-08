package everyday.day8.error;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scanner.nextLine();
		}

	}

}
