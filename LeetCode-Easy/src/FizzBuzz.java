/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.*/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> l = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				l.add("FizzBuzz");
			} else if (i % 3 == 0)
				l.add("Fizz");
			else if (i % 5 == 0)
				l.add("Buzz");
			else
				l.add(String.valueOf(i));
		}
		return l;
	}

	public static void main(String srgs[]) {
		FizzBuzz ob = new FizzBuzz();
		System.out.println("Result= " + ob.fizzBuzz(15));
	}
}
