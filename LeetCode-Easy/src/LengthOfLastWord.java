import java.util.Scanner;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length - 1].length();
	}

	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a string:\n");
			String str = in.nextLine();
			int n = lengthOfLastWord(str);
			System.out.print(n);
		}
	}
}
