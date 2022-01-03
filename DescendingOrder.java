package descendingorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrder {
	public static int sortDesc(final int num) {
		String stringNum = String.valueOf(num);
		char[] stringNumArr = stringNum.toCharArray();
		ArrayList<Character> numList = new ArrayList<>();
		for (char c : stringNumArr) {
			numList.add(c);
		}
		Collections.sort(numList, Collections.reverseOrder());
		stringNum = "";
		for (char s : numList) {
			stringNum += s;
		}
		return Integer.parseInt(stringNum);
	}

	public static void main(String[] args) throws InterruptedException {
		boolean repeat = true;
		Scanner scan = new Scanner(System.in);
		while (repeat) {

			System.out.println("Enter the number that you want in reverse/descending order:");
			int i = scan.nextInt();
			System.out.println("Here you go:");
			System.out.println(sortDesc(i));
			System.out.println("Would you like to repeat? (y/n):");
			/**
			 * Scanner.nextInt() or Scanner.next() does not read newline in input created
			 * when the user hits enter, therefore we use an extra Scanner.nextLine() before
			 * we read the actual nextLine so that the extra nextLine() reads that newline
			 * character in the previous line.
			 */
			scan.nextLine(); // newline character read in that isn't read by nextInt()
			String s = scan.nextLine().strip();

			if (s.equals("n")) {
				System.out.println("Goodbye.");
				repeat = false;
				scan.close();
			}
		}

	}
}