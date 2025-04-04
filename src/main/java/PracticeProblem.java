public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num) {
		if (num < 3) { //so it doesn't need to check each time in recursion
			return -1;
		}

		return calculateMovesRecursive(num); //helper that does the recursion
	}

	private static int calculateMovesRecursive(int n) {
		if (n == 1) { //base c
			return 1;
		}

		else { //recursive
			int movesForNMinus1 = calculateMovesRecursive(n - 1);

			return 2 * movesForNMinus1 + 1;
		}
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
