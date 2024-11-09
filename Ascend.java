// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int[] randomNumbers = {0, 0, 0};
		for (int i = 0; i < 3; i++) {
			randomNumbers[i] = (int)((Math.random() * lim));
			System.out.print(randomNumbers[i] + " ");
		}
		System.out.println();

		int[] sorted = {0, 0, 0};

		//Finding Min of the three values
		int small = Math.min(Math.min(randomNumbers[0], randomNumbers[1]), randomNumbers[2]);
		sorted[0] = small;

		//Finding Max of the three values
		int large = Math.max(Math.max(randomNumbers[0], randomNumbers[1]), randomNumbers[2]);
		sorted[2] = large;
		int count = 0;
		
		//Finding remaining value without using if
		while (randomNumbers[count] == small || randomNumbers[count] == large) {
			count++;
		}
		sorted[1] = randomNumbers[count];



		for (int i = 0; i < 3; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();
	}
}
