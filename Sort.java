import java.util.Random;

public class Sort{
	public static void selectionSort(int[] ary){
		int index = 0;
		int smallest = 0;
		int[] output = new int[ary.length];
		while (index < ary.length){
			for (int x = index; x < ary.length; x++){
				if (ary[x] < smallest){
					smallest = ary[x];
				}
			}
			output[index] = smallest;
			index++;
		}

		for(int x = 0; x < output.length; x++){
			System.out.println(output[x]);
		}
	}

	public static void main(String[] args) {
		Random randgen = new Random();
		int[] test = new int[100];
		for (int x = 0; x < 101; x++){
			test[x] = randgen.nextInt();
		}

		selectionSort(test);
	}
}
