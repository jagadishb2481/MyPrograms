package hackerrankpack;

import java.util.*;

class FizzBuzz {
	static void fizbuzz(int n) {
		if (n >= 1 && n <= 100) {
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0)
					System.out.print("FizzBuzz" + " ");
				else if (i % 5 == 0)
					System.out.print("Buzz" + " ");
				else if (i % 3 == 0)
					System.out.print("Fizz" + " ");
				else
					System.out.print(i + " ");
			}
		}
	}

	public static void main(String args[]) {
		fizbuzz(100);

	}
}