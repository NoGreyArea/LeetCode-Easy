/*Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

import java.math.BigInteger;

public class BinaryAddition {
	public String addBinary(String a, String b) {
		BigInteger n1 = new BigInteger(a, 2);
		BigInteger n2 = new BigInteger(b,2);
		BigInteger sum = n1.add(n2);
		return sum.toString(2);
	}

	public static void main(String srgs[]) {
		BinaryAddition ob = new BinaryAddition();
		System.out.println("Result= " + ob.addBinary("11","1"));
	}
}
