import java.util.Random;

public class Sort{
	public static void selectionSort(int[] ary){
		int index = 0;
		int[] output = new int[ary.length];
		int smallest = ary[0];


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
