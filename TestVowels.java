import java.util.Scanner;

public class TestVowels extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word:");
		String word = scanner.nextLine();

		int result = testVowels(word);

		if (result == 1)
			System.out.println("Yes");
		else
			System.out.println("No");

		scanner.close();
	}
}

class UserMainCode {

	public static int testVowels(String word) {

		int count = 0;

		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
				continue;

			for (int j = i + 1; j < word.length(); j++) {

				if (c == word.charAt(j))
					return 2;

			}
			count++;
		}

		if (count == 5)
			return 1;
		else
			return 2;

	}

}
