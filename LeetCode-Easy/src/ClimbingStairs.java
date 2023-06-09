
public class ClimbingStairs {
	public int climbStairs(int n) {
		int a = 0, b = 1, c=0; //using fibonacci series
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String srgs[]) {
		ClimbingStairs ob = new ClimbingStairs();
		int n = 5;
		System.out.println("Distinct Steps that can be taken= " + ob.climbStairs(n));

	}
}
