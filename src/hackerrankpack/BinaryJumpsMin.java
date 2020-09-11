package hackerrankpack;

// java programme to calculate power of jump 
import java.util.ArrayList;

public class BinaryJumpsMin {

	
	/*public static int maxJump(String s) {
		int count = 1;
		int max = 0;
		char ch = s.charAt(s.length() - 1);
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				if (count > max) {
					max = count;
				}
				count = 1;
			} else {
				count++;
			}
		}
		return max;
	}*/
	
	// Function to calculate the maximum power of the jump
	public static int powerOfJump(String s) {

		int count = 1; // Initialize the count with 1
		int max_so_far = Integer.MIN_VALUE;
		char ch = s.charAt(s.length() - 1); // Find the character at last index
		// Start traversing the string
		for (int i = 0; i < s.length(); i++) {
			// Check if the current char is equal
			// to the last character
			if (s.charAt(i) == ch) {

				// max_so_far stores maximum value of
				// the power of the jump from starting
				// to ith position
				if (count > max_so_far) {
					max_so_far = count;
				}
				// Reset the count to 1
				count = 1;
			}
			// Else, increment the number of jumps/count
			else
				count++;
		}
		// Return the maximum number of jumps
		return max_so_far;
	}
	
	public static int maxJump(String str) {
		int max=0;
		int count=1;
		char ch = str.charAt(str.length()-1);
		for(int i =0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				if(count>max) {
					max=count;
				}count=1;
			}else {
				count++;
			}
		}
		return max;
	}

	// Driver code
	public static void main(String[] args) {
		String st = "101100";
		System.out.println(powerOfJump(st));// geeksforgeeks logic
		System.out.println(maxJump(st)); // my logic
	}
}