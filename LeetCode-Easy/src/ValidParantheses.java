import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static boolean checkValidity(String s) {
		Stack<Character> parantheses = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				parantheses.push(s.charAt(i));
			} else {
				if (parantheses.isEmpty())
					return false;
				if (parantheses.peek() == '(' && s.charAt(i) != ')')
					return false;
				if (parantheses.peek() == '[' && s.charAt(i) != ']')
					return false;
				if (parantheses.peek() == '{' && s.charAt(i) != '}')
					return false;
				parantheses.pop();

			}
		}

		return parantheses.isEmpty();
	}

	public static void main(String args[]) {
		String str = "{}[]()";
		System.out.println(checkValidity(str));
	}

}
