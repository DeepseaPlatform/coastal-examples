package issue42;

import za.ac.sun.cs.coastal.Symbolic;

public class MyExample {

	public static void main(String[] args) {
		test("a");
	}

	public static void test(String body) {
		if (AClass.INST == null) {
			Symbolic.mark(-1);
		} else {
			Symbolic.mark(1);
		}
	}
}
