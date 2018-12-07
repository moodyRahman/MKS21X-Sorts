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
				}
			}
		}
	}


	public static void bubbleSort(int[] data){
		int length = data.length;    //assume the list is not sorted
		boolean sorted = false;      //but it needs to be set to true to trip wire back
		while (!sorted){
			sorted = true;
			for (int index = 0; index < length - 1; index++){
				if (data[index] > data[index+1]){
					int temp = data[index];
					data[index] = data[index + 1];
					data[index + 1] = temp;
					sorted = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Random randgen = new Random();
		int[] test = new int[20000];
		for (int x = 0; x < 20000; x++){
			test[x] = randgen.nextInt() % 10000;
		}

		// System.out.print("OG LIST \n");
		// for (int x: test){
		// 	System.out.print(x + ", ");
		// }
		// System.out.println("\nEND OG");

		long startTime = System.nanoTime();
		bubbleSort(test);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration / 100000000.0);
		for (int x : test){
			System.out.print(x);
			System.out.print(", ");
		}
		System.out.println();


	}
}
