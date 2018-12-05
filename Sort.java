import java.util.Random;

public class Sort{
	public static void selectionSort(int[] ary){
		for (int x : ary){
			System.out.println(x);
		}
		
		int index = 0;
		int[] output = new int[ary.length];
		int smallPos = 0;
		int largest = ary[0];

		for (int x = 0; x < ary.length; x++){
			if (ary[x] > largest){
				largest = ary[x];
			}
		}

		while (index < ary.length){
			int smallest = ary[index];
			for (int x = 0; x < ary.length; x++){
				if (ary[x] < smallest){
					smallest = ary[x];
					smallPos = x;
				}
			}
			ary[smallPos] = largest + 1;
			output[index] = smallest;
			index++;
		}

		System.out.println("aaaaa");
		for (int x : output){
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Random randgen = new Random();
		int[] test = new int[20];
		for (int x = 0; x < 20; x++){
			test[x] = randgen.nextInt() % 10;
		}

		selectionSort(test);
	}
}
