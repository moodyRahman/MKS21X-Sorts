import java.util.Random;

public class Sort{
	public static void selectionSort(int[] ary){
		for(int x = 0; x < ary.length; x++){
			System.out.println(ary[x]);
		}

		System.out.println("AAAAAAA");

		System.out.println("BBBBB");
		for(int x = 0; x < output.length; x++){
			System.out.println(output[x]);
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
