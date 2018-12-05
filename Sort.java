import java.util.Random;

public class Sort{
	public static void selectionSort(int[] ary){
		
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
