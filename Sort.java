import java.util.Random;

public class Sort{
	public static void selectionSort(int[] ary){
		int length = ary.length;
		for (int x = 0; x < length - 1; x++){
			for (int val = x + 1; val < length; val++){
				if (ary[x] > ary[val]){
					int temp = ary[x];
					ary[x] = ary[val];
					ary[val] = temp;
					for (int b : ary){
						System.out.print(b);
						System.out.print(", ");
					}
					System.out.println();
				}
			}
		}

		for (int x : ary){
			System.out.print(x);
			System.out.print(", ");
		}
	}

	public static void main(String[] args) {
		Random randgen = new Random();
		int[] test = new int[20];
		for (int x = 0; x < 20; x++){
			test[x] = randgen.nextInt() % 9;
		}

		System.out.print("OG LIST \n");
		for (int x: test){
			System.out.print(x + ", ");
		}
		System.out.println("\nEND OG");

		// long startTime = System.nanoTime();
		selectionSort(test);
		// long endTime = System.nanoTime();
		// long duration = (endTime - startTime);
		// System.out.println(duration / 1000000);
	}
}
